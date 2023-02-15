import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int number = 0;
        
        while(number == 0){
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += 1; }
            if (num % 2 == 1) {
                odd += 1; }
            if (num == -1) {
                break;
            }                
        }
        System.out.print("Odd number = " + odd + " and Even number = " + even);
    }
}