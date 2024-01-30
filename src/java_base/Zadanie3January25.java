package java_base;

import java.util.Scanner;
public class Zadanie3January25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество моющего средства");
        double sredstvo = sc.nextInt();
        System.out.println("Введите количество тарелок");
        double tarelki = sc.nextInt();
        for (sredstvo = sredstvo - tarelki; sredstvo > 0; sredstvo = sredstvo - 0.5) {
            tarelki--;
            System.out.println(tarelki);
        }

    }

}
