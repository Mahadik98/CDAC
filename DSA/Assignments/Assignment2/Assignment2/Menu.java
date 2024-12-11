import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DoublyCircularLink obj =new DoublyCircularLink();
        // System.out.println("Enter size of stack:");
        int choice;
        // int size=in.nextInt();
        obj.create_List();
        do
        {
            System.out.print("\nList Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Insert Left");
            System.out.print("\n2.Insert Right");
            System.out.print("\n3.Delete Left");
            System.out.print("\n4.Delete Right");
            System.out.print("\n5.Print Stack");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter left element:");
                    int e=in.nextInt();
                    obj.insert_left(e);
                    break;

                case 2:
                    System.out.print("\nEnter right element:");
                    int f=in.nextInt();
                    obj.insert_right(f);
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;

                case 5:
                    System.out.println("Elements in List are: ");
                    obj.printlist();
                
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;

                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice != 0);
    }
}
