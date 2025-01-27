public class CheckRotation{
    public static int arrayRotate(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return (i+1);
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr={4,6,8,10,3,1};
        System.out.print(arrayRotate(arr)+" ");
    }
}