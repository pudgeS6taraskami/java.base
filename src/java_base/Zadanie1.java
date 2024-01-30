package java_base;

public class Zadanie1 {
    public static void main(String[] args) {
        int floors = 10;
        int flats = 5;
        int i;
        int flat = 1;
        int a;
        for (i = 1; i <= floors; i++) {
            for (a = flat; a <= flats; a++) {
                System.out.println("Этаж" + " " + i + " " + "Квартира" + " " + a + " " + "Посылка доставлена");
            }
        }
    }
}

