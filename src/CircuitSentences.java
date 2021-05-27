import java.util.Scanner;

import static java.lang.System.out;

public class CircuitSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("문자열을 입력하세요 : ");
        
        String str = sc.nextLine();
        char saveStr[] = new char[str.length()];

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            saveStr[i] = str.charAt(i);
        }

        for(int i = 0; i < saveStr.length; i++){
            if(saveStr[i] == 'l' && saveStr[i+1] == 'o' && saveStr[i+2] == 'v' && saveStr[i+3] == 'e'){
                count++;
            }
        }

        out.print(count);
        
        sc.close();
    }
}
