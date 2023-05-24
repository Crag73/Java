import java.util.*;

class test{
    public static void main(String args[]){
        int a;

        try{
            a=10/0;
        }
        catch(Exception e){
            System.out.print(e);
        }
        finally{
            System.out.print("done");
        }
    }
}