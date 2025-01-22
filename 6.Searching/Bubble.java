public class Bubble{
    public static void bubble_sort(int[] input){
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;

                }
            }
        }

    }
    public static void main(String[] args){
        int[] arr={6,9,4,3,5,1};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
