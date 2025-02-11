public class Selection{
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main(String[] args){
        int arr[]={56,23,33,9,14};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}