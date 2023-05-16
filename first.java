public class first{
    public static void main(String[] args){
    int n=5;
    for(int j=0;j<n;j++){
    for(int i=n-j;i>-1;i--){
        System.out.print(" ");
    }
    char ch='A';
    for(int i=0;i<=j;i++){
        System.out.print(ch);
        ch++;
    }
    ch='A';
    for(int i=0;i<j;i++){
        System.out.print(ch);                   
        ch++;
    }
    System.out.print("\n");
}
    }
}