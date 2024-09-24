public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");

        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        char clientOS = 0;
        short deviceYear = 2021;
        short clientDeviceYear = 2015;
        if (deviceYear >= clientDeviceYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (deviceYear < clientDeviceYear) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        short year = 2021;
        if (year % 4 == 0) {
            System.out.println(year + " год - является високосным годом");
        } else {
            System.out.println(year + " год - не является високосным годом");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        short deliveryDistance = 95;
        byte deliveryTime = 1;
        boolean mediumDistance = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean longDistance = deliveryDistance >= 60 && deliveryDistance <= 100;
        System.out.println("Если Вы живете на расстоянии - " + deliveryDistance + " км от банка, то для доставки банковской карты на дом");
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (mediumDistance) {
            System.out.println("Потребуется дней: " + (deliveryTime + deliveryTime));

        } else if (longDistance) {
            System.out.println("Потребуется дней: " + (deliveryTime + deliveryTime + deliveryTime));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        byte monthNumber = 12;
        System.out.println(monthNumber + " месяц");
        switch (monthNumber) {
            case 1:
                System.out.println("Январь это зимний месяц");
                break;
            case 2:
                System.out.println("Февраль это зимний месяц");
                break;
            case 12:
                System.out.println("Декабрь это зимний месяц");
                break;
            case 3:
                System.out.println("Март это весенний месяц");
                break;
            case 4:
                System.out.println("Апрель это весенний месяц");
                break;
            case 5:
                System.out.println("Май это весенний месяц");
                break;
            case 6:
                System.out.println("Июнь это летний месяц");
                break;
            case 7:
                System.out.println("Июль это летний месяц");
                break;
            case 8:
                System.out.println("Август это летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь это осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь это осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}