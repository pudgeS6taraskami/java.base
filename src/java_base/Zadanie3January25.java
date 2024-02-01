package java_base;

import java.util.Scanner;
public class Zadanie3January25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество моющего средства");
        double sredstvo = sc.nextDouble();
        System.out.println("Введите количество тарелок");
        double tarelki = sc.nextDouble();
        for (sredstvo = sredstvo - tarelki; sredstvo > 0; sredstvo = sredstvo - 0.5) {
            tarelki--;
            System.out.println(tarelki);
        }

    }

}
