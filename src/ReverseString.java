import java.util.Scanner;

import static java.lang.System.out;

public class ReverseString {
    public static char[] Reverse(String str){
        int storeStr = str.length();
        char temp;
        char[] getStr = str.toCharArray();

        for(int i = 0; i < storeStr / 2; i++){
            temp = getStr[i];
            getStr[i] = getStr[getStr.length - i - 1];
            getStr[getStr.length - i - 1] = temp;
        }

        return getStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        out.println(str);
        out.print(Reverse(str));

        sc.close();
    }
}