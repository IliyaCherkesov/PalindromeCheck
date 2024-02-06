package palindrome;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            boolean doBreak = false;
            printMenu();
            String str = scanner.nextLine();
            switch(str.trim()) {
                case "1":
                    System.out.println("Please, enter to string to palindrome check:");
                    String strToCheck = scanner.nextLine();
                    if (checkToPalindrome(strToCheck)) {
                        System.out.println("String is palindrome");
                    } else {
                        System.out.println("String is not palindrome");
                    }
                    break;
                default:
                    doBreak = true;
                    break;
            }
            if (doBreak) {
                break;
            }
        }
        scanner.close();
    }

    private static void printMenu()
    {
        System.out.println("Please select an option:");
        System.out.println("1. Check palindrome");
        System.out.println("2. Exit");
    }

    public static boolean checkToPalindrome(String str)
    {
        String strClean = str.toLowerCase().replaceAll("[\\s+\\.,1-9\\?':;\\!\\^\\$\\@]+", "").toLowerCase();
        System.out.println("SC: " + strClean + ":" + new StringBuilder(strClean).reverse().toString());
        return strClean.equals(new StringBuilder(strClean).reverse().toString());
    }

}

