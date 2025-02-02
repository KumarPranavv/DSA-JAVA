public class Reverse{
    public static String reverseString(String s){
        String result="";
        int i=s.length()-1;
        int end=s.length();
        while(i>=0){
            if(s.charAt(i)==' '){
               result+= s.substring(i+1,end)+" ";
               end=i;
            }
            i--;
        }
        result+=s.substring(i+1,end);
        return result;


    }
    public static void main(String[] args){
        String str="Hola AMigos, kaise ho.";
        System.out.println(reverseString(str));

    }
}