public class Practice{
    public static void main(String[] args){
        int x=10;
        int y=20;
        if(x++ > 10 || ++y > 20){
            System.out.print("inside if ");
        }
        else{
            System.out.print("inside else ");
        }
        System.out.println(x+" "+y);
    }
}