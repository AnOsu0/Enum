package Lesson;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
//        System.out.println("XSMALL - " + Tshirt.XSMALL);
//        System.out.println("SMALL - " + Tshirt.SMALL);
//        System.out.println("MEDIUM - " + Tshirt.MEDIUM);
//        System.out.println("LARGE - " + Tshirt.LARGE);
//        System.out.println(Size.SMALL.getDescription() + " " + Size.SMALL.name() + " "
//                + Size.SMALL.ordinal());
//        System.out.println(Size.MEDIUM.getDescription() + " " + Size.MEDIUM.name() + " "
//                + Size.MEDIUM.ordinal());
//        System.out.println(Size.LARGE.getDescription() + " " + Size.LARGE.name() + " "
//                + Size.LARGE.ordinal());

        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value.toString());

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar:");
        String size = sc.nextLine();
        Size shirtSize = Size.fromDescription(size);


        Tshirt tshirt = new Tshirt();
        tshirt.setSize(shirtSize);

        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar T-Shirta: " + tshirt.getSize().getDescription());
    }
}
