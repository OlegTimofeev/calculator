package com.epam.calculator;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);
    public static final String regExp= "-?(sqrt\\d+|\\d+|\\d+.\\d+) (([*/+\\-]) -?(sqrt\\d+|\\d+|-\\d+|\\d+.\\d+) )+";

    public static void main(String[] args){
        QueueCalculator qc = new QueueCalculator();
        Scanner sc = new Scanner(System.in);
        String str;
        logger.info("\nДля операции sqrt число пишется сразу после ( Пример sqrt9 ) \nЕсли число отрицательное, то слитно( Пример -7 )\nВ других случаях цифры и знаки пишутся через пробел ");
        System.out.println("Введите пример");
        while(true) {
            str = sc.nextLine().trim()+" ";
            if (!str.matches(regExp)) {
                logger.info("поправьте пример");
            }
            else {
                logger.info(str+"= "+qc.getAnswer(str));
                logger.info("Введите пример");
            }
        }
    }

}
