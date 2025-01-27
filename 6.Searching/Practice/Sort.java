public class Sort{
    public static void sort012(int[] arr){
        int nextZero=0;
        int next2=arr.length-1;
        int i=0;
        while(i<=next2){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                i++;
                nextZero++;
            }
            else if(arr[i]==2){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                next2--;

            }else{
                i++;

            }
        }
    }
    public static void main(String[] args){
        int[] arr={3,5,0,8,1,4,2};
        sort012(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}