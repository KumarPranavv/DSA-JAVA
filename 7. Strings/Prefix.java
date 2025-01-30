public class Prefix{
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.substring(0,i+1));
        }
    }
    public static void main(String[] args){
        String str="abcdef";
        print(str);
    }
}