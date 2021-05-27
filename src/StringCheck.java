import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String targetData = "love";

        int count = 0;

        for(int i = 0; i < userInput.length() - targetData.length(); i++){
            if(userInput.substring(i, i + targetData.length()).equals(targetData)){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
