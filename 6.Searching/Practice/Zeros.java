public class Zeros{
    public static void pushZeroes(int[] arr){
        int current=0;
        int nonZeroPos=0;
        while(current<arr.length){
            if(arr[current]!=0){
                int temp=arr[current];
                arr[current]=arr[nonZeroPos];
                arr[nonZeroPos]=temp;
                 
            }
            nonZeroPos++;
        }
    }
    public static void main(String[] args){
        int[] arr={4,6,0,7,0,5,2};
        pushZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}