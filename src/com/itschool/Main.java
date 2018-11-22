package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double a, P;

	    System.out.println("Программа вычисляет сторону квадрата по его периметру.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите периметр квадрата:");
        P = in.nextDouble();

        if (P>0){
            a = P/4;
            System.out.println("Сторона квадрата равена: а = "+a);
        }
        else {
            System.out.println("Периметр квадрата не может быть отрицательным или равен 0.");
        }
    }
}
