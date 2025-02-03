public class RowSum{
    public static void sum(int[][] arr){
        int rows=arr.length;
        if(rows==0){
            return;
        }
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
                rowSum+=arr[i][j];
            }
            System.out.print(rowSum+" ");
        }

    }
    public static void main(String[] args){
        int arr1[][]=new int[3][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=3;
        arr1[1][0]=1;
        arr1[1][1]=2;
        arr1[1][2]=3;
        arr1[2][0]=1;
        arr1[2][1]=2;
        arr1[2][2]=3;
        sum(arr1);
    }
}