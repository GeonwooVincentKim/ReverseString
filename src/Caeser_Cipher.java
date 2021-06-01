import java.util.Scanner;

import static java.lang.System.out;

public class Caeser_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char storeStr[] = new char[str.length()];

        int convertInt = 0;

        for (int i = 0; i < storeStr.length; i++) {
            storeStr[i] = str.charAt(i);
            convertInt = (int) storeStr[i];

            if (storeStr[i] == ' ') {
                storeStr[i] = ' ';
            } else if (storeStr[i] != ' ') {
                if (storeStr[i] == 'a') {
                    storeStr[i] = (char) 'x';
                } else if (storeStr[i] == 'b') {
                    storeStr[i] = (char) 'y';
                } else if (storeStr[i] == 'c') {
                    storeStr[i] = (char) 'z';
                } else {
                    convertInt = convertInt - 3;
                    storeStr[i] = (char) convertInt;
                }
            }
        }

        out.print(storeStr);

        sc.close();
    }
}
