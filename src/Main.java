public class Main {

//    public static void printSeparator() {
//        System.out.println("++++++++++++");
//        System.out.println("------------");
//    }
//
//    public static void printIssues(int issueCount) {
//        System.out.println(issueCount);
//    }
//
//    public static int sum(int[] numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        return sum;
//    }

    //    public static void main(String[] args) {
//        int[] issuesByMonths = {14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        printSeparator();
//        for (int i = 0; i < issuesByMonths.length; i++) {
//            printIssues(issuesByMonths[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesByMonths);
//        printIssues(total);
//    }
    public static void main(String[] args) {
        task1();
        task2();
//        task3();
    }

    public static void task1() {
        if (findLeapYear() >= 1584) {
            if ((findLeapYear() % 4 == 0 && findLeapYear() % 100 != 0) || (findLeapYear() % 400 == 0)) {
                System.out.println(findLeapYear() + " is a leap year.");
            } else {
                System.out.println(findLeapYear() + " is not a leap year.");
            }
        } else {
            System.out.println(findLeapYear() + " is not a leap year, because this concept was introduced in 1584.");
        }
    }

    public static int findLeapYear() {
        int year = 2023;
        return year;
    }

    public static void task2() {
        settingParameters();
    }
    public static void settingParameters() {
        int deviseYear = 2022;
        int deviseSystem = 1;
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
}