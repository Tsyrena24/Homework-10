import java.time.LocalDate;

public class Main {
    public static void leapYearCheck (int year) {
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " является невисокосным годом.");
        }
    }
    public  static void UpdateOC (int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < LocalDate.now().getYear() && clientOS == 0) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < LocalDate.now().getYear() && clientOS == 1){
            System.out.println("Установите lite-версию приложения для Android по ссылке.");
        } else if (clientDeviceYear >= LocalDate.now().getYear() && clientOS == 0) {
            System.out.println("Установите эту версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите эту версию приложения для Android по ссылке.");
        }
    }
    public static void BankCardDelivery (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется день для доставки карты.");
        }
        else if (deliveryDistance >20 && deliveryDistance <=60){
            System.out.println("Потребуется два дня для доставки карты.");
        }
        else if (deliveryDistance >60 && deliveryDistance <= 100){
            System.out.println("Потребуется три дня для достваки карты.");
        } else System.out.println("На такое расстояние доставка не доставляется, приносим свои извинения.");
        System.out.println();
    }


    public static void main (String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 40000;
        leapYearCheck(year);
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2021;
        UpdateOC(clientOS, clientDeviceYear);
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int  deliveryDistance = 1001;
        BankCardDelivery(deliveryDistance);


    }
}