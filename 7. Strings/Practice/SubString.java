public class SubString{
    public static void print(String s){
        int n=s.length();
        for(int i=0;i<n;++i){
            for(int j=i;j<n;++j){
                for(int k=i;k<n;++k){
                    System.out.print(s.charAt(k));
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        String str="abcdef";
        print(str);
    }
}