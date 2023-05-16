import java.util.*;
public class gcd {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int min= (num1<num2) ? num1:num2; 
            int gcd=0;
            for(int i=1;i<=min;i++){
                if(num1%i==0 && num2%i==0){
                    gcd=i;
                }
            }
            System.out.print(gcd);
        }
    }
}
