import java.util.Scanner;
public class Triangle19Modify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int a = 1; a <= N - i; a++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
            
    }
}
    
