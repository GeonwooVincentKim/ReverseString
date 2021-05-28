import static java.lang.System.out;

import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();

        char saveStr[] = new char[str.length()];
        char saveStr1[] = new char[str1.length()];
        
        int cnt = 0;
        int cnt1 = 0;
        int i = 0;
        
        for(i = 0; i < str.length(); i++){
            saveStr[i] = str.charAt(i);
            cnt = i;
        }
        
        for(i = 0; i < str1.length(); i++){
            saveStr1[i] = str1.charAt(i);
            cnt1 = i;
        }

        if(saveStr.length > saveStr1.length){
            out.print(saveStr1);
            out.print(" ");
            out.print(saveStr);
        } else if(saveStr.length < saveStr1.length){
            out.print(saveStr);
            out.print(" ");
            out.print(saveStr1);
        } else if(saveStr.length == saveStr1.length){
            for(i = 0; i < saveStr1.length; i++){
                if(saveStr[i] > saveStr1[i]){
                    out.print(saveStr1);
                    out.print(" ");
                    out.print(saveStr);
                    break;
                } else if(saveStr[i] < saveStr1[i]){
                    out.print(saveStr);
                    out.print(" ");
                    out.print(saveStr1);
                    break;
                } else {}
            }
        }

        out.println();

        sc.close();
    }
}
