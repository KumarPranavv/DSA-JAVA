public class MoreFunctions{
    public static double sum(int a,int b, double c){
        double ans=a+b+c;
        return ans;
    }

    public static void printEven(int start,int end){
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
    public static void main(String[] args){
        printEven(1,160);
        /*int num1=10;
        int num2=90;
        double result=sum(num1,num2,1.2);*/
        //System.out.println("the sum is: "+sum(10,88,1.99));
    }
}