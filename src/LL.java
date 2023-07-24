class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int length;
    LinkedList(int value){
        Node newNode =new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    void append(int value){
        Node NewNode=new Node(value);
        if(length==0){
            head=NewNode;
            tail=NewNode;
        }
        else {
            tail.next = NewNode;
            tail = NewNode;
        }
        length++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("null");

    }
    void Delete(int value){
        if(length==0){
            System.out.println("NULL");
        }
        else{
            Node temp=head;
            Node prev=head;
            while (temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            tail=prev;
            tail.next=null;
            length--;
            if(length==0){
                head=null;
                temp=null;
            }
        }
    }

}

public class LL {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList(4);
        ll.append(5);
        ll.append(6);
        ll.display();
        System.out.println();
        ll.Delete(6);
        ll.display();
        }
    }
