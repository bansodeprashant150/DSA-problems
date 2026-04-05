package List.Hashmap;

import java.util.Scanner;
import java.util.Stack;

class ValidBrackets {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('|| ch=='['|| ch=='{'){
                stack.push(ch);
            }

            else{
                if(stack.isEmpty()){
                    System.out.println("False");
                    return;
                }
                char top=stack.pop();
                if( (ch==')'&&top!='(')||
                    (ch==']'&&top!='[')||
                    (ch=='}'&&top!='{')){
                        System.out.println("False");
                        return;
                    }
            }
        }

        if(stack.isEmpty()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
