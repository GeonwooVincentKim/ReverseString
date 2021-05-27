import java.util.Scanner;

import static java.lang.System.out;

public class StringCheckWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String getData = sc.nextLine();
        String convertData = "love";

        int count = 0;

        for(int i = 0; i < getData.length() - convertData.length(); i++){
            if(getData.substring(i, i + convertData.length()).equals(convertData)){
                count++;
            }
        }

        out.println(count);
        sc.close();
    }
}
