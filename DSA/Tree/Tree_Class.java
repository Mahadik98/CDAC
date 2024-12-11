public class Tree_Class {
    Tnode root;

    void insert(Tnode r, Tnode n)// r:root ref n:new node
    {
        if (root == null)
            root = n;
        else {
            if (n.data < r.data) {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);
            } else {
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);
            }
        }
        System.out.println(n.data + " inserted in tree");
    }

    void inorder(Tnode r) {
        if (r != null)// LPR
        {
            inorder(r.left);// L
            System.out.print(r.data + ",");// P
            inorder(r.right);// R
        }
    }

    void postorder(Tnode r) {
        if(r != null)// LRP
        {
            postorder(r.left);// L
            postorder(r.right);// R
            System.out.print(r.data + ",");// P
        }
    }

    void preorder(Tnode r) {
        if (r != null)// PLR
        {
            System.out.print(r.data + ",");// P
            preorder(r.left);// L
            preorder(r.right);// R
        }
    }

    boolean search(int key, Tnode r) {
        if (r == null)
            return false;
        else if (r.data == key)
            return true;
        else if (r.data > key)
            return search(key, r.left);
        else
            return search(key, r.right);
    }

    int count_node(Tnode r) {
        if (r == null)
            return 0;
        else {
            int lcount = count_node(r.left);
            int rcount = count_node(r.right);
            return 1 + lcount + rcount;

        }

    }
}

























/*
 * if(r==null)
 * return false;
 * else if(r.data==key)
 * return true;
 * else if(r.data>key)
 * return search(key,r.left);
 * else
 * return search(key,r.right);
 * 
 * }
 * /*
 */
