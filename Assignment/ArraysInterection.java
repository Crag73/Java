import java.util.*;
public class ArraysInterection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        Hashtable <Integer,Integer> arr1=new Hashtable<>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(arr1.containsKey(a)){
                count=arr1.get(a);
                count++;
                arr1.put(a,count);
            }
            else{
                arr1.put(a,1);
            }
        }
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(arr1.containsKey(a)){
                count=arr1.get(a);
                if(count>0){
                    count--;
                    result.add(a);
                    arr1.put(a,count);
                }
            }
        }
        Collections.sort(result);
        System.out.print(result);
    }
}
