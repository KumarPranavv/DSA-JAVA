public class ArraySum{
    public static int sum(int[] arr, int startIndex){
        int n=arr.length;
        if(startIndex==n){
            return 0;
        }
        return arr[startIndex]+sum(arr,startIndex+1);

    }
    public static int sum(int arr[]){
        return sum(arr,0);
    }
    public static void main(String[] args){
        
    }
}