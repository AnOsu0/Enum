package example1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] value = Pizza.values();
        for (Pizza temp : value) {
            System.out.println(temp.toString());
        }

        System.out.println("Wybierz numer pizzy którą chcesz zamówić:");
        Scanner sc = new Scanner(System.in);
        int pizza = sc.nextInt();
        Pizza a = Pizza.MARGHERITA.fromNumber(pizza);

        System.out.println("Zamówiłeś pizzę " + a.name());
    }
}
