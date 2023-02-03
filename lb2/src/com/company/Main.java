package com.company;
import java.util.Scanner;

public class Main {

    static void zadanie1() {
        double x = 1;
        for (int i = 2; i <= 10000; i++) {
            if (i % 2 == 0) {
                x -= 1. / i;
            } else {
                x += 1. / i;
            }
        }
        System.out.printf("Ответ задания 1: %.2f", x);
    }

    static void zadanie2() {
        int q;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите цифру")
        switch(q){

        }
    }

    public static void main(String[] args) {

        zadanie1();
    }
}
