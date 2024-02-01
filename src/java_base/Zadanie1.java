package java_base;

public class Zadanie1 {
    public static void main(String[] args) {
        int floors = 10;
        int flats = 5;
        int curflat = 1;
        for (int i = 1; i <= floors; i++) {
            if (i > 1)
                curflat = (i * 5) - 4; //
            for (int j = curflat; j <= flats * i; j++) {
                System.out.println("Этаж" + " " + i + " " + "Квартира" + " " + j + " " + "Посылка доставлена");
            }
        }
    }
}

