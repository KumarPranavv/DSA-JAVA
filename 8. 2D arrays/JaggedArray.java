public class JaggedArray{

    public static void main(String[] args){
        int arr[][]=new int[3][5];
        System.out.println(arr[0]);

        int arr2[][]=new int[4][];// no. of columns not specified
        System.out.println(arr2);
        //System.out.println(arr2[0]); // not refering to anyhting hence NULL

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}