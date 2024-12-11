import java.util.Scanner;

public class Tree_Main {
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int choice;
        Tree_Class obj=new Tree_Class();
        do
        {
            System.out.print("\nTree Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Insert");
            System.out.print("\n2.Inorder");
            System.out.print("\n3.PostOrder");
            System.out.print("\n4.PreOrder");
            System.out.print("\n5.Search");
            System.out.print("\n6.Count Nodes");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element:");
                        int e=in.nextInt();
                        Tnode n=new Tnode(e);
                        obj.insert(obj.root,n);
                        break;
                case 2:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\nElements in tree:\n");
                        obj.inorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;
                case 3:
                    if(obj.root!=null)
                    {
                        System.out.print("\nElements in postorder:\n");
                        obj.postorder(obj.root);
                    }
                case 4:
                    if(obj.root!=null) 
                    {
                        System.out.print("\nElements in preorder:\n");
                        obj.preorder(obj.root);
                    }   
                case 5:
                    if(obj.root!=null)
                    {
                        System.out.print("\nEnter element to search:");
                        int k=in.nextInt();
                        boolean found=obj.search(k,obj.root);
                        if(found)
                            System.out.print("\nElement found...");
                        else
                            System.out.print("\nElement not found...");
                    }    
                case 6:
                    if () {
                        
                    }   
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice!=0);
    }
}
