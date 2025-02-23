public class CheckSorted{
    public static boolean check(int[] arr){
        int n=arr.length;
        if(n<=1){
            return true;
        }
        int smallArr[]=new int[n-1];
        for(int i=1;i<n;i++){
            smallArr[i-1]=arr[i];
        }
        boolean ans=check(smallArr);
        if(!ans){
            return false;
        }
        if(arr[0]<=arr[1]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int[] arr={1,3,4,5,8};
        System.out.println(check(arr));
    }
}