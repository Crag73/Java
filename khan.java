import java.util.*;
public class khan {

    public static void main(String args[]){
        String s="my name is khan";
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>-1;i--){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    
}
