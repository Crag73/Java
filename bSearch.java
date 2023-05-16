
public class bSearch {
    static int bSearch(int[] arr,int target){
        int s=0,e=arr.length-1,mid;

        while(s<=e){
            mid=(s+e)/2;
            if(target==arr[mid])
            return mid;
            else if(target>arr[mid])
            s=mid+1;

            else
            e=mid-1;
        }
        return -1;
    }
}
