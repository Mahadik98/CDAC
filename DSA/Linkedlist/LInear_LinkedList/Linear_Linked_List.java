package LInear_LinkedList;

// import org.w3c.dom.Node;

public class Linear_Linked_List {

    Node root;

    void create_List() {
        root = null;
    }

    void insert_left(int data) {
        var n = new Node(data);

        if (root == null)
            root = n;// first
        else {
            n.next = root;// 1
            root = n; // 2
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

    void delete_right() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;// 1
            Node t2 = root;// 1
            while (t.next != null)// 2
            {
                t2 = t;
                t = t.next;
            }
            if (root == t)
                root = null;// 3 single node
            else
                t2.next = null;// 3
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

    void search_data(int data) {
        if (root == null) {
            System.out.println("List Empty!");
        } else {
            Node t = root;
            boolean found = false;
            while (t != null) {
                if (t.data == data) {
                    found = true;
                    break;
                }
                t = t.next;
            }

            if (found)
                System.out.println(data + " found");

        }

        // Node t = root;
        // boolean found = false;
        // while(t!=null){
        // if(t.data == data){
        // found = true;
        // break;
        // }
        // t = t.next;
        // }

        // if(found)
        // System.out.println(data + " found");
        // else
        // System.out.println(data + " not found");

    }

    void delete_element(int key) {
        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;
            Node t2 = root;
            while (t != null) {
                if (key == t.data)
                    break;
                t2 = t;
                t = t.next;
            }
            if (t != null)// found
            {
                if (t == root)// case 1
                    root = root.next;
                else if (t.next == null)// case 2
                    t2.next = null;
                else
                    t2.next = t.next;// case 3
                System.out.println(t.data + " deleted");
            } else {// not found

                System.out.println(key + " not found in list ");
            }
        }
    }

   void insert_after(int ref,int data)

{
if(root==null)
System.out.println("\nList Empty");
else
{
Node t=root;//ref
while(t!=null)//2
{
if(ref==t.data)
break;
t=t.next;
}
if(t!=null)//found
{
Node n=new Node(data);//new node created

    n.next=t.next;//1

    t.next=n;//2

System.out.println(data+" inserted in list");
}
else//not found
System.out.println(ref+" not found in list ");
}
}
}