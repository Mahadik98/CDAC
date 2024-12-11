package LInear_LinkedList;
import java.util.Scanner;
public class Dsprogram {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            var obj = new DynamicQueue();
            int el;
            int choice;
            obj.createlist();
            do { 
                System.out.println("Choice: \n0. Exit\n");
                System.out.print("1. Enqueue \n");
                System.out.print("2. Dequeue\n");
                System.out.print("3. PrintList\n");
                System.out.println();
                System.out.print("Enter the choice: ");

                choice = sc.nextInt();
                switch(choice){
                    case 0 ->{
                        System.out.println("Exiting.........");
                    }
                    case 1-> {
                        System.out.print("Enter the push Element: ");
                        el = sc.nextInt();
                        obj.insert_right(el);
                    }
                    
                    case 2-> {
                        obj.delete_left();
                    }
                    
                    case 3 ->{
                        obj.print_list();
                    }
                    
                    default ->{
                        System.out.println("Wrong option selected");
                    }
                }
            } 
            while (choice != 0);
        }
    }
}