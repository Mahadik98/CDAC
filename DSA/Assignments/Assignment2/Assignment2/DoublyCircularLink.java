
public class DoublyCircularLink {
    
    Node root = null;
    Node last = null;

    void create_List()
    {
        root=last=null;
    }

    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null) {
            root =last= n;
            root.next= root;
            root.previous= root;
        }
        else
        {
           n.next = root;
           n.previous = last;
           root.next = n;
           last.next = n;
           root = n;
        }
    }


    void delete_left()
    {

        if(root==null){
            System.out.println("\nList Empty");
            return;
        }
        if(root == root.next){
            root=last=null;
        }
        else
        {
            root = root.next;
            root.previous = last;
            last.next = root;
        }
    }

    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)
        {
            root =last= n;
            root.next = root;
            root.previous = root;
        }
        else
        {
          last.next = n;
          n.previous = last;
          n.next = root;
          root.previous = n;
          last = n;
        }
    }


    void delete_right()
    {

        if(root==null){
            System.out.println("\nList Empty");
            return;
        }  
        if(root==root.next){
            root=last=null;
        }else{
            last = last.previous;
            last.next = root;
            root.previous = last;
        }
    }
    
    void printlist()
    {
        if(root==null){
            System.out.println("\nList Empty");
            return;
        }
            Node tot = root;
            do
            {
                System.out.print("|"+tot.data+"|->");
                tot=tot.next;
            }while(tot != root);
        System.out.println();
        }
    }

