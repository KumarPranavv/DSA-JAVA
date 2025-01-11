public class Basics{
    public static void main(String[] args){
        int arr[] = new int[10];
        arr[9]=982;
        //arr[-1]; // This will give an error- array index out of bounds
        System.out.println(arr[9]);
        System.out.println(arr);

        char[] a=new char[5];
        double[] b=new double[5];
        a[0]='a';
        System.out.println(a[0]);
        System.out.println(a[3]); //Null char
        System.out.println(b[0]);
    }
}