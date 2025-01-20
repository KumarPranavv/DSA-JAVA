public class PairSum{
    public static int Sums(int[] arr, int x){
        int numPairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    numPairs++;
                }
            }
        }
        return numPairs;
    }
    public static void main(String[] args){

    }
}