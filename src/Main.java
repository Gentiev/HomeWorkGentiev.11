public class Main {

    public static void main(String[] args) {
        findLeapYear(2000);
        settingParameters(2022, 1);
        int days = calculationDays(95);
        System.out.println(days);
    }
//task.1
    public static void findLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0 && year >= 1584) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
//task.2
    public static void settingParameters(int deviseYear, int deviseSystem) {
        int currentYear = 2024;
        if (deviseYear >= currentYear && deviseSystem == 1) {
            System.out.println("Install the Android version of the app using the link.");
        } else if (deviseYear >= currentYear && deviseSystem ==0) {
            System.out.println("Install the iOS version of the app using the link.");
        } else if (deviseYear <= currentYear && deviseSystem ==1) {
            System.out.println("Install the lite Android version of the app using the link.");
        } else if (deviseYear <= currentYear && deviseSystem ==0) {
            System.out.println("Install the lite iOS version of the app using the link.");
        }
    }
//task.3
    public static int calculationDays (int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance < 60) {
            deliveryDays = deliveryDays + 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
        } else {
            System.out.println("You are outside the delivery radius, delivery over a distance of more than 100km is not carried out.");
        }
        return deliveryDays;
    }
//        int deliveryDays = 0;
//        if (deliveryDistance < 20) {
//            deliveryDays = deliveryDays + 1;
//            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
//        } else if (deliveryDistance < 60) {
//            deliveryDays = deliveryDays + 2;
//            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
//        } else if (deliveryDistance <= 100) {
//            deliveryDays = deliveryDays + 3;
//            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
//        } else {
//            System.out.println("You are outside the delivery radius, delivery over a distance of more than 100km is not carried out.");
//        }
//    }
}