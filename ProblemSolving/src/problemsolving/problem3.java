package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        int total_num = user_input.nextInt();   // Total Input number
        int[] array = new int[total_num];     
        
        int first, mid, last; 
        int sum_left, sum_right;
        if(total_num < 100000){
            for(int i = 0; i < total_num; i++){
                array[i] = user_input.nextInt();    //Taking all input
            }
            
            Arrays.sort(array);
            
            /* Calculating the expected the value */
            first = 0; last = array.length -1;
            do{
                sum_left = 0; sum_right = 0;
                mid =(first + last) / 2;
                
                for (int i = 0; i < array.length - 1; i++) {
                    
                    if(array[i] < array[mid]){
                        sum_left = sum_left + array[i];
                    }
                    if(array[i] > array[mid])
                        sum_right = sum_right + array[i]; 
                    
                }
                
                
                if(sum_left < sum_right){
                    first = mid+1;
                }
                else if(sum_left == sum_right){
                    System.out.println("YES");
                    break; 
                }
                
            }while (sum_left < sum_right);
            
            if(sum_left > sum_right){
                System.out.println("NO");
            }
        }
    }
}