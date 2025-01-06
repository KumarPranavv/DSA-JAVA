public class Scope{
    public static void main(String[] args){
        int i=10; //this variable i is valid under this paranthesis only
        System.out.println(i);
        if(i==10){
            int n=23;
            System.out.println(i);
            System.out.println(n);
        }else{
            int n=232; // this n=232 is valid for this Paranthesis
            System.out.println(n);
        }
        int n=4;
        System.out.println(n);
        i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }


    }
}