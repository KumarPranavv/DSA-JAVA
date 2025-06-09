public class FindNode{
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int find(Node head, int key){
        if(head==null){
            return -1;
        }
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;

    }
    public static void main(String[] args){

    }
}