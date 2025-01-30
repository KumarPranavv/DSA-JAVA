import java.util.Scanner;
public class StringUse {
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        //int[] arr2={1,2,3}; now
        int[] arr2=arr1;
        if(arr1==arr2){ //refers the address of arr1 and arr2 , that must be different 
            System.out.println("equal");
            
        }else{
            System.out.println("Not equal");

        }
        System.out.println(arr1);
        System.out.println(arr2);



       /* char c='c';
        String str="abcdefgh";
        str="abc";
        
      //  print(str);
        str=str+"def";
        System.out.println(str);
        System.out.println(str.concat("ghi")); // only adds here not to the main

        /*System.out.println(str.charAt(1));
        System.out.println("Length of String: "+str.length());
        System.out.println("Substring: "+str.substring(1,6)); //end index is not included in this 
        System.out.println(str.substring(3)); // begin/start print all from begin index
        System.out.println(str.substring(0)); // similar as print(str)
        System.out.println(str.substring(str.length())); //empty string
        System.out.println(str.contains("cdf")); */
    }
}