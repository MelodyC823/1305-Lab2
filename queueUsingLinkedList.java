import java.util.LinkedList;
import java.util.Queue;


public class queueUsingLinkedList {

    Node front;
    Node back;

    void insert( int a ){
        Node new_node = new Node();
        new_node.data = a;

        if(front == null && back == null ){
            front = new_node;
            back = new_node;
        }else{
            back.next = new_node;
            back = new_node;
        }

    }

    void remove(){
        front = front.next;

    }

    int peek(){
        return front.data;
    }
    public static void main(String[] args) {
        Queue<Integer> obj = new LinkedList<>();

        obj.add(6);
        obj.add(4);
        obj.add(7);
        obj.add(3);
        obj.remove();
        System.out.println(obj.peek()); // 4
    }
}