public class DeleteNode{


    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Node deleteNode(Node head, int x) {
        // code here
        if(head==null){
            return head;
        }
        if(x<1){
            return head;
        }
        if(x==1){
            return head.next;
        }
        Node temp=head;
        int pos=1;
        while(temp!=null && pos<x-1){
            pos++;
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void main(String[] args){
        
    }
}