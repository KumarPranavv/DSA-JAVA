public class Bubble{
    public static void sort(int[] arr){
        int n =arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]={34,22,67,31,5,2};
        sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}