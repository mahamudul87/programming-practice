
package problemsolving;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int total_case = user_input.nextInt();
        int first_num, last_num;
        int num_of_palindrome ;
        
        for (int j = 1; j <=total_case; j++) {
            num_of_palindrome = 0;
            first_num = user_input.nextInt();
            last_num = user_input.nextInt();
            
            for (int i = first_num; i <= last_num; i++) {
                String a = Integer.toString(i);
            
                StringBuffer sb = new StringBuffer(a);
                String b = sb.reverse().toString();
                if(b.equals(a)){
                    num_of_palindrome = num_of_palindrome +1;
                }
            }
            System.out.println(num_of_palindrome);
        }
    }
}