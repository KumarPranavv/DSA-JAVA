public class CheckSorted_2{
    public static boolean check(int[] arr){
        int n=arr.length;
        if(n<=1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int smallArr[]=new int[n-1];
        for(int i=1;i<n;i++){
            smallArr[i-1]=arr[i];
        }
        boolean ans=check(smallArr);
        return ans;
        /*if(ans){ equivalent to return ans
            return true;
        }
        else{
            return false;
        }*/
        
    }

    public static void main(String[] args){
        int[] arr={2,1,4,5,8};
        System.out.println(check(arr));
    }
}