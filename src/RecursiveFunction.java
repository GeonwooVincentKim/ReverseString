import static java.lang.System.out;

import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String splitStr[] = null;
        int i = 0, cnt = 0;
        int result = 0;

        int converter = 0;

        for(i = 0; i < str.length(); i++){
            splitStr = str.split("");
        }

        for(i = 0; i < splitStr.length; i++){
            converter = Integer.parseInt(splitStr[i]);
            cnt += converter;
        
            if(cnt > 1 && cnt % 3 == 0){
                result = 1;
            } else if(cnt % 3 != 0){
                result = 0;
            }
        }

        out.println(result);

        sc.close();
    }
}
