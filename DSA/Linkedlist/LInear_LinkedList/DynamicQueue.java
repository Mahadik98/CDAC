//Dynamic queue using linkedlist

package LInear_LinkedList;

public class DynamicQueue {
    Node root;


    void createlist(){
        root = null;
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null)
            root = n;// first
        else {
            Node t = root;// 1
            while (t.next != null)// 2
                t = t.next;
            t.next = n;// 3
        }
        System.out.println(data + " inserted");
    }
    void delete_left() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;// 1
            root = root.next;// 2
            System.out.println(t.data + " deleted");// 3
        }

    }
    void print_list() {
        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;// 1
            while (t != null)// 2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }
}
