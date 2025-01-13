public class Solution{
    public static void arrange(int[] arr, int n){
        int left=0;
        int right=n-1;
        int counter=1;
        while(left<=right){
            if(counter%2==1){
                arr[left]=counter;
                counter+=1;
                left+=1;

            }
            else{
                arr[right]=counter;
                counter+=1;
                right-=1;
            }
        }
    }
    
}