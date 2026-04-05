package List.Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookUsingHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,String> phonebook=new HashMap<>();
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            String phone=sc.nextLine();
            phonebook.put(name, phone);

        }

        while(sc.hasNext()){
            String query=sc.nextLine();

            if(phonebook.containsKey(query)){
                System.out.println(query+"="+phonebook.get(query));
            }
            else{
                System.out.println("NOt Found");
            }
        }

        sc.close();
    }
}
