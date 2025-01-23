public class Merge{
    public static int[] mergeSort(int[] arr1, int[] arr2){
        int ans[]=new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;

            }

        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        for(int p=0;p<ans.length;p++){
            System.out.print(ans[p]+" ");
        }
        return ans;
        
    }
    public static void main(String[] args){
        int[] arr1={2,6,8,12};
        int[] arr2={1,3,7,9};
        mergeSort(arr1,arr2);

    }
}