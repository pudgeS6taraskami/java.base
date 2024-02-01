package java_base;

import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        money = sc.nextInt();
        int proc = money / 10; // Деление на 10
        int countYear = 0;

        for (int i = proc; i <= 1000000; i = i + proc) {
                countYear++;
                System.out.println(countYear);

            }
        }
    }




