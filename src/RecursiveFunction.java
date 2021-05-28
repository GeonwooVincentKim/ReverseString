import static java.lang.System.out;

import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        char strSave[] = new char[str1.length()];
        char strSave2[] = new char[str2.length()];
        char strSave3[] = new char[str3.length()];

        for(int i = 0; i < str1.length(); i++){
            strSave[i] = str1.charAt(i);
        }

        for(int i = 0; i < str2.length(); i++){
            strSave2[i] = str2.charAt(i);
        }

        for(int i = 0; i < str3.length(); i++){
            strSave3[i] = str3.charAt(i);
        }

        if(strSave[0] == strSave3[strSave3.length - 1] && strSave2[0] == strSave[strSave.length - 1] && strSave3[0] == strSave2[strSave2.length - 1]){
            out.println("good");
        } else {
            out.println("bad");
        }

        sc.close();
    }
}
