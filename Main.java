import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        for(int i=1;i<(n-1);i++){
            System.out.println("  ");
        }
    }
}