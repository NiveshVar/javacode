import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int sum = 0;
        int i=1;
        while(i<n+1){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum: "+sum);
    }
}
