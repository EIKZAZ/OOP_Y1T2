import java.util.Scanner;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please specify the height of the building : ");
        int height = sc.nextInt();
        
        for(int x = 1; x <= height;x++ ){
            System.out.println("#-#-#-#-#");
        }
    }
}
