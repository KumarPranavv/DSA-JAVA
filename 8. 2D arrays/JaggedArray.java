public class JaggedArray{

    public static void main(String[] args){
        int arr[][]=new int[3][5];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        int arr2[][]=new int[4][];// no. of columns not specified
        System.out.println(arr2);
        //System.out.println(arr2[0]); // not refering to anyhting hence NULL
       // System.out.println(arr2[0][0]);
        for(int i=0;i<arr2.length;i++){
            arr2[i]=new int[2];
            System.out.println(arr2[i]);
        }
        System.out.println(arr2[0][0]);

    }
}