package problem3;

import java.util.Scanner;
public class Problem3 {
    
    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int total_num = user_input.nextInt();
        int[] array = new int[total_num];
        for(int all_inp = 0; all_inp < total_num; all_inp++){
            array[all_inp] = user_input.nextInt();
        }
        
        /* Sorting the "array" Array */
        int temp;  // to keep greater variable in the temporary variable. 
        for(int outer_loop = 0; outer_loop < total_num - 1; outer_loop++){
            int first_index =0, second_index = 1;
            for(int sort_loop = 0; sort_loop < total_num -1; sort_loop++){
                if(array[first_index] > array[second_index]){
                    temp = array[first_index];
                    array[first_index] = array[second_index];
                    array[second_index] = temp;
                }
                first_index++; second_index++;
            }
        }
        
        
        /* To show sorted output */
        /*
        System.out.println(" ");
        System.out.print("Sorted Output: ");
        for(int all_inp = 0; all_inp < total_num; all_inp++){
            System.out.print(array[all_inp] + " ");
        }
        System.out.println(" ");
        */
        
        /* Checking sum of the coin of the both side of the choosen coin */
        //System.out.println(" ");
        int first = 0, last = array.length - 1;
        int mid; 
        int sum_left, sum_right;
        do{
            mid = (first+last) / 2;
            //System.out.println("first: " + first +" Mid: " + mid + " Last: " + last);
            
            /* Counting left sum */
            sum_left = 0;
            for(int left = mid-1; left >=0; left -- ){
                if(array[left] != array[mid]){
                    sum_left = sum_left + array[left];
                }
            }
            //System.out.println("left Sum: " + sum_left);
            
            /* Counting right Sum */
            sum_right = 0; 
            for(int right = mid+1; right < array.length; right++){
            if(array[right] != array[mid]){
                sum_right = sum_right + array[right]; 
            }
        }
        
            /* Applying condition to forwar right or backward left */
            if(sum_left < sum_right){
                first = mid +1;
            }
            //System.out.println("Right Sum: " + sum_right);
            if(sum_left > sum_right){
                last = mid - 1;
            }
            if(sum_left == sum_right){
                System.out.println("YES");
                break; 
            }
        }while(first <= last);
        if(sum_left != sum_right){
            System.out.println("NO");
        }
    }
}
