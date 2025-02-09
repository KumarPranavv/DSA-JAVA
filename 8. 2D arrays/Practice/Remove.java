public class Remove{
    public static String removeChar(String s, char c){
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=c){
                ans+=s.charAt(i);
            }
        }
        return ans;

    }
    public static void main(String[] args){
        String str="aabbccbbaa";
        char ch='a';
        System.out.println(removeChar(str,ch));
    }
}