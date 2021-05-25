import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
           if (s.charAt(i) != s.charAt(n - i - 1)) {
               out.println("false");
               return false;
           }
        }

        out.println("true");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int readLine = Integer.parseInt(sc.nextLine());

        String getData = "";
        boolean isIterate = false;
        
        for (int i = 1; i <= readLine; i++) {
            out.println("입력===");
            getData = sc.nextLine();
            isIterate = isPalindrome(getData);
        }
    }
}
