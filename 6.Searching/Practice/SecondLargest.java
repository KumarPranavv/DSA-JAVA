public class SecondLargest{
    public static int second(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }

        int largest=arr[0];
        int secondLarg=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                secondLarg=largest;
                largest=arr[i];
            }else if(secondLarg<arr[i] && arr[i]!=largest){
                secondLarg=arr[i];
            }
        }
        return secondLarg;

    }
    public static void main(String[] args){
        int[] arr={4,7,13,25,9,8,19};

        System.out.println("Second largest element is: "+second(arr));
    }
}