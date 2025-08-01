import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(); 
        String s = String.valueOf(n);
        int leng = s.length(); 
        int n1=n;
        int arm=0;
        while(n>0){
            int r = n%10;
            int t=1;
            for(int i = 1;i<=leng;i++){
                t=t*(r*1);
            }
            arm+=t;
            n=n/10;

        }
        System.out.println(n1+" is Armstrong: " + (arm==n1));
    }
}
