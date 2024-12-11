package LInear_LinkedList;

import java.util.Scanner;

public class Linked_List_Main {
    public static void main(String[] args) {
         var obj = new Linear_Linked_List();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_List();// creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search Element\n7.Delete Element\n8.Inbetween\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
                case 6:
                    System.out.println("Enter element to search:");
                    int data =in.nextInt();
                    obj.search_data(data);
                    break;
                case 7:
                    System.out.println("Enter element to delete:");    
                    int key = in.nextInt();
                    obj.delete_element(key);
                case 8:
                    
                    int ref = in.nextInt();
                    System.out.println("Enter element to insert after:");
                    int data1 = in.nextInt();
                    obj.insert_after(ref,data1);    
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }

        } while (ch != 0);

    }
}
