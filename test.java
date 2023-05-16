import java.util.*;
public class test {
    public static boolean pal(String s){
        int n=s.length();
        if(n==1){
            return true;
        }
        boolean flag=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                flag=false;
            }
        }
        if(flag==true){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(pal(s.substring(i,j))) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
