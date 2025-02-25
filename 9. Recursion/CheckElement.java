public class CheckElement{
    public static boolean check(int[] arr, int startIndex, int X){
        int n=arr.length;
        if(n==startIndex){
            return false;
        }
        if(startIndex==X){
            return true;
        }
        check(arr, startIndex+1, X);
        return false;
    }
    public static void main(String[] args){
        int arr[]={2,5,6,9};
        System.out.println(check(arr,0,6));
    }
}