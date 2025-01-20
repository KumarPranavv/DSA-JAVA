public class Sort{
    public static void sort(int arr[]){
        int nextZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }
        }
    }
    public static void main(String[] args){
        
    }

}