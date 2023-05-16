import java.util.*;
public class choco {
    public static void solve(Scanner ob){
        int n,k;
        int cost=0,variety=0;
        n=ob.nextInt();
        k=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }   
        Arrays.sort(arr);

        for(int ab:arr){
            cost+=ab;
            variety+=k;
            if(variety>=n){
                System.out.print(cost);
                return;
            }
        }


    }
    public static void main (String args[]) {
        int t;
        Scanner obj=new Scanner(System.in);
        t=obj.nextInt();
        while(t--!=0){
            solve(obj);
        }
    }
}