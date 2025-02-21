public class Output1{
    public static void print(int n){
        if(n<0){
            return;
        }
        System.out.print(n+" ");
        print(n-2);

    }
    public static void main(String[] args){
        int num=8;
        print(num);
    }
}