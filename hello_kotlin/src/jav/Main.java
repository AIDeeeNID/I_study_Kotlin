package jav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balanceN = sc.nextInt();

        if (balanceN >= 500){
           System.out.println("пицца");
        }else if (balanceN <= 500 && balanceN >= 200){
            System.out.println("шаурма");
        }else if (balanceN <= 200){
            System.out.println("доширак");
        }
    }
}
