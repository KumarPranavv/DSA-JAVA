public class Length{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    public static void main(String[] args){
        
    }
}