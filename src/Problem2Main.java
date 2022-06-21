import java.util.Scanner;
public class Problem2Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int[] array = new int[2];
        int test_num = user_input.nextInt();
        int [] output = new int [test_num];
        int temp, mod, sum;
        int memory;
        for(int i = 0; i < test_num; i++){
            for(int j = 0; j < 2 ; j++){
                array[j] = user_input.nextInt();
            }
            int first_num = array[0];
            int last_num = array[1];
            memory = 0;
            if(first_num > 0 && last_num < 100000 && first_num < last_num){
                for(int count =first_num; count<=last_num; count++){
                    temp = count;
                    sum = 0;
                    while (temp > 0){
                        mod = temp % 10;
                        sum = (sum*10) + mod;
                        temp = temp/10;
                        if(sum == count){
                            memory = memory +1;
                        }
                    }
                }
            }
            output[i] = memory;
        }
        for(int i = 0; i < test_num; i++){
            System.out.println(output[i]);
        }
    }
}