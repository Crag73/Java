public class nestedb{
    static boolean search(int [][]matrix,int target){
        int n;
        n=matrix[0].length;

        int sc=matrix[0][0];
        int ec=matrix[n-1][0];
        int midc;
        while(sc<=ec){
            midc=(sc+ec)/2;
            if(matrix[midc][0]>target){
                sc=midc+1;
            }
            else{
                ec=midc-1;
            }
        }
        System.out.print(sc+","+ec);
        // int sr =matrix[ec][0];
        // int er=matrix[ec][m-1];
        // int midr;
        // while(sr<=er){
        //     midr=(sr+er)/2;
        //     if(matrix[ec])
        // }

        return false;
    } 
    public static void main(String[]args){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        search(matrix,16);
        //Column
    }
}