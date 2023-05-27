import java.util.*;
public class OddEven {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=0;i<n;i++){
			int t=sc.nextInt();
			ll.add(t);
		}
		for(int i=0;i<n;i++){
			int a=ll.get(i);
			if(a%2==1){
				System.out.print(a+" ");
			}
		}
		for(int i=0;i<n;i++){
			int a=ll.get(i);
			if(a%2==0){
				System.out.print(a+" ");
			}
		}
    }
}