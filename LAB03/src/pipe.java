import java.util.Scanner;
public class pipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number :");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            if (i % 5 != 0) {
                System.out.print("|");
            }
            if (i % 5 == 0) {
                System.out.println("|");
            }
        }
    }
}
