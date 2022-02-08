package example2;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order order1 = new Order("Szampon",12.99,Status.PAID);
        Order order2 = new Order("Grzebień",10.99,Status.PAID);
        Order order3 = new Order("Chusteczki",7.99,Status.NEW);
        Order order4 = new Order("Mydło",8.99,Status.NEW);
        Order order5 = new Order("Krem",20.99,Status.SHIPPED);
        Order order6 = new Order("Odżywka",14.99,Status.SHIPPED);
        Order order7 = new Order("Pasta do zębów",17.99,Status.DELIVERED);
        Order order8 = new Order("Szczoteczka",16.99,Status.DELIVERED);
        Order order9 = new Order("Szminka",9.99,Status.CANCELED);
        Order order10 = new Order("Maskara",5.99,Status.CANCELED);
        Order[] orders = {order1, order2, order3,order4,order5,order6, order7, order8,order9, order10};
        System.out.println("Podaj status zamówień do wyświetlenia:" + Shop.StatusNames());
        String check = sc.nextLine();
        Status tempStat = Status.valueOf(check);
        System.out.println("zamówienia o podanym stausie to: ");
        Shop.showArray(Shop.check(orders,tempStat));

    }
}
