import java.util.ArrayList;
import java.util.*;


public class CountNodes{
    public class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>>children;
        public TreeNode(T data){
            this.data=data;
            children=new ArrayList<>();
        }
    }

    public static int count(TreeNode root){
        int count=1;
        for(int i=0; i<root.children.size();i++){
            count+=count(root.children.get(i));
        }
        return count;
    }
    public static void main(String[] args){

    }
}