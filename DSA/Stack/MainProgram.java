import java.util.Scanner;

public class MainProgram {

    static int getPrecendence() {
        if (word.charAt(i) == '^') {
            return 3;
        } else if (word.charAt(i) == '*' || '/' || '%') {
            return 2;
        } else if (word.charAt(i) == '+' || '-') {
            return 1;
        }
    }

    static void showResult(String word){

        String store;

        Example obj = new Example();

        obj.createStack(word.length());

        String[] Final = new String[word.length()];

        for(int i = 0; i<= word.length(); i++){

            if((word.charAt(i) == '^') || (word.charAt(i) == '*') || (word.charAt(i) == '/') || (word.charAt(i) == '+') || (word.charAt(i) == '-')){
                if(obj.is_empty()){
                    obj.push(word.charAt(i));
                }
                else if(! obj.is_empty()){
                    store =(char)obj.peek();
                    char a=word.charAt(i);
                    int prv=getPrecendence(store);
                    int cur=getPrecendence(a);
                        if(cur > prv){
                            obj.push(a);
                        }
                        else{
                            String xyz = obj.pop();
                            Final.add(charAt(xyz));
                        }
                }
            else{
                Final.add(charAt(word));
            }
            System.out.print("Postfix is: " +Final);
        }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Expression :");
        String word = sc.nextLine();
        System.out.println("Postfix expression is : ");

    }
}
