public class Main {

    public static void main(String[] args) {
        findLeapYear(2000);
        settingParameters(2022, 1);
        calculationDay(95);
    }
//task.1
    public static void findLeapYear(int year) {
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year, because this concept was introduced in 1584.");
        }
    }
//task.2
    public static void settingParameters(int deviseYear, int deviseSystem) {
        int currentYear = 2024;
        if (deviseYear >= currentYear) {
            if (deviseSystem == 1) {
                System.out.println("Install the Android version of the app using the link.");
            } else {
                System.out.println("Install the iOS version of the app using the link.");
            }
        } else {
            if (deviseSystem == 1) {
                System.out.println("Install the lite Android version of the app using the link.");
            } else {
                System.out.println("Install the lite iOS version of the app using the link.");
            }
        }
    }
//task.3
    public static void calculationDay (int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = deliveryDays + 1;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays = deliveryDays + 2;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
            System.out.println("It will take days for the card to be delivered: " + deliveryDays);
        } else {
            System.out.println("You are outside the delivery radius, delivery over a distance of more than 100km is not carried out.");
        }
    }
}