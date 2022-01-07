package com.huy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("nhập a,b,c : ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta>0){
            System.out.println("x1="+ quadraticEquation.getRoot1());
            System.out.println("x2="+quadraticEquation.getRoot2());
        }else if (delta == 0){
            System.out.println("x1=x2"+quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
