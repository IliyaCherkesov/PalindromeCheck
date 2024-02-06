package palindrome;

import java.util.Scanner;

public class Main
{



    public static boolean checkToPalindrome(String str)
    {
        String strClean = str.toLowerCase().replaceAll("[\\s+\\.,1-9\\?':;\\!\\^\\$\\@]+", "").toLowerCase();
        System.out.println("SC: " + strClean + ":" + new StringBuilder(strClean).reverse().toString());
        return strClean.equals(new StringBuilder(strClean).reverse().toString());
    }

}

