package com.company;

public class Main {

    public static void main(String[] args) {
        //Создать переменную по имени name, которая будет сохранять имя человека
        String name = "Sam";
        //Вторая переменная содержит возраст человека
        int age = 12;
        // Третья переменная - температура на улице сегодня
        int temperature = 28;

        if ((20 <= age && age <= 45) && (-20 <= temperature && temperature <= 30)) {
            System.out.println("Можно идти гулять");
        }
        if ((age < 20) && (0 < temperature && temperature < 28)) {
            System.out.println("Можно идти гулять");
        }
        if ((age > 45) && (-10 < temperature && temperature < 25)) {
            System.out.println("Можно идти гулять");
        }


    }
}
