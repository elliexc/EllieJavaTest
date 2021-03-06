package LinkedList;

/**
 * author: zhanghongtao
 * date  : 2018-10-17 3:10 PM
 * email : zhtxcster@gmail.com
 */


public class LinkedListExample {

    public static void main(String []args) {
        NodeT head = new NodeT(0);
        NodeT node1 = new NodeT(1);
        NodeT node2 = new NodeT(2);
        NodeT node3 = new NodeT(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        NodeT h = head;
        while ( h != null) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }

        head = reverse(head);

        System.out.print("\n************************\n");

        while ( head != null) {
            System.out.print(head.getData()+ " ");
            head = head.getNext();
        }


    }

    public static NodeT reverse(NodeT head){

        if(head == null || head.getNext() == null) {
            return head;
        }

        NodeT rehead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return rehead;
    }
}


class NodeT {
    private int data;
    private NodeT next;

    public NodeT (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeT getNext() {
        return next;
    }

    public void setNext(NodeT next) {
        this.next = next;
    }
}