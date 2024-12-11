import java.util.Scanner;

public class MainProgram {

    static int getPrecendence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' ||  ch =='/') {
            return 2;
        } else if (ch == '+' || ch =='-') {
            return 1;
        }
    return 0;
    }


    static void showResult(String word){
        int store;

        Example obj = new Example();

        obj.createStack(word.length());

        String[] Final = new String[word.length()];
        int index = 0;

        for(int i = 0; i< word.length(); i++){
            char curr = word.charAt(i);

            if((curr == '^') || (curr == '*') || (curr == '/') || (curr == '+') || (curr == '-')){
                if(obj.is_empty()){
                    obj.push(curr);
                }
                else{
                    store = obj.peek(); 
                    int previous = getPrecendence((char)store);
                    int recent = getPrecendence(curr);
                        if(recent > previous){
                            obj.push(curr);
                        }
                        else{
                            Final[index++] = String.valueOf((char)obj.pop());
                            i--; 
                        }
                }
            }
            else{
                Final[index++] = String.valueOf(curr);
            }
        }

        while(! obj.is_empty()){
            Final[index++]= String.valueOf((char)obj.pop());
        }

        System.out.println("Postfix expression is : ");
        for(int i=0; i<index; i++){
            System.out.print(Final[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Expression :");
        String word = sc.nextLine();
        
        showResult(word);
    }
}
