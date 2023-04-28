/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.practical_1_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author user
 */
public class SaverRunnable implements Runnable {
    private Doctor doctor;
    private String path;

    public SaverRunnable(Doctor doctor, String path) {
        this.doctor = doctor;
        this.path = path;
    }
    
    @Override
    public void run(){ 
        if(this.path != null && doctor != null) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.path));
                    //поток вывода в файл по заданному пути
                oos.writeObject(doctor); //запись параметров класса
                oos.close(); //закрытие потока вывода
                System.out.println("Сериализация прошла успешно!");
            } catch (IOException ex) {
                System.out.println("Ошибка сериализации! Путь файла: " + this.path);
                
            }
        }
    }
}
