public class CheckSortedBetter{
    public static boolean check(int[] arr, int startIndex){
        int n=arr.length;
        if(startIndex>=n-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        return check(arr,startIndex+1);

    }
    public static void main(String[] args){
        int arr[]={4,9,12,2};
        System.out.println(check(arr,0));
    }
}