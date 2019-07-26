package com.epam.calculator;

import java.util.Scanner;

public class Main {
    public static final String regExp= "-?(sqrt\\d+|\\d+|\\d+.\\d+) (([*/+\\-]) -?(sqrt\\d+|\\d+|-\\d+|\\d+.\\d+) )+";

    public static void main(String[] args){
        QueueCalculator qc = new QueueCalculator();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Для операции sqrt число пишется сразу после ( Пример sqrt9 ) \nЕсли число отрицательное, то слитно( Пример -7 )\nВ других случаях цифры и знаки пишутся через пробел ");
        System.out.println("Введите пример");
        while(true) {
            str = sc.nextLine().trim()+" ";
            if (!str.matches(regExp)) {
                System.out.println("поправьте пример");
            }
            else {
                System.out.println(str+"= "+qc.getAnswer(str));
                System.out.println("Введите пример");
            }
        }
    }

}
