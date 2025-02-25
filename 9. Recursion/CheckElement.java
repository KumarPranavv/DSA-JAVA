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
        
    }
}