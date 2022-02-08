package example2;

import java.util.Scanner;

public class Shop {
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;

    public static Order[] check(Order[] order, Status status) {
        Order[] temp = new Order[countByOrders(order,status)];
        for (Order or : order) {
            if (status.equals(or.getStatus())) {
                temp[count] = or;
                count++;
            }
        }

        return temp;
    }

    public static int countByOrders(Order[] order, Status status){
        int counting = 0;
        for (Order or : order) {
            if (status.equals(or.getStatus())) {
                counting++;
            }
        }
        return counting;
    }

    public static void showArray(Order[] or){
        for (Order temp: or) {
            System.out.println(temp.toString());
        }
    }

    public static String StatusNames(){
        String info = " ";
        Status[] temp = Status.values();
        for (Status stat: temp) {
            info = info + stat.name() + " ";
        }
        return info;
    }

//    public static void showArray(Order[] order) {
//        if (count == 0) {
//            System.out.println("brak zamówień o podanym statusie");
//        } else {
//            for (int i = 0; i < count; i++) {
//
//                System.out.println(order[i].toString());
//
//            }
//        }
//    }

}
