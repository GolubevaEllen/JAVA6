/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kt.mirea.practical_1_12;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_12 {

    public static void main(String[] args) {
        System.out.println("Практическая работа 1.12 | Вариант 3 | Голубева А.П.");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        if (name  == null) {name = "Иван";}
        System.out.print("Введите фамилию: ");
        String surname = scan.nextLine();
        if (surname  == null) {name = "Иванов";}
        System.out.print("Введите возраст: ");
        int age = scan.nextInt();
        System.out.print("В каком ВУЗе учился?: ");
        String education = scan.nextLine();
        if (education  == null) {name = "МИРЭА";}
        System.out.print("Введите опыт работы: ");
        int experience = scan.nextInt();
        
        Doctor doctor = new Doctor(name, surname, age, education, experience);
        SaverRunnable sr = new SaverRunnable(doctor, "C:/doctor.txt"); //создание интерфейса сохранения класса
        Thread th = new Thread(sr); //создание потока c интерфейсом сохранения
        th.start(); //запуск потока
    }
}
