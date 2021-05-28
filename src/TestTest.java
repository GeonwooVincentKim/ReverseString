import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        int num = 1;

        int arr[][] = new int[userInput][userInput];
        for(int i = 0; i < userInput; i++){
            for(int j = 0; j < userInput; j++){
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
