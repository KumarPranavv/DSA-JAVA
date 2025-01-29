
public class Palindrome {
    public static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            
            }
            else{
                i++;
                j--;
            }


        }
        return true;

    }

    public static void main(String[] args) {
        String str="aabbbaa";
        System.out.println(checkPalindrome(str));


    }
}