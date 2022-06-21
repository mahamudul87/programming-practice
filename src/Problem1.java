import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int [] fst_line = new int [3];

        /* Taking 3 input for N,M,d */
        for (int count =0; count <=2; count++){
            fst_line[count]= user_input.nextInt();
        }
        int [] N=new int[fst_line[0]];
        int [] M= new int [fst_line[1]];
        int d = fst_line[2];

        /* Taking N (Customers amount) for all customer  as input*/
        for(int count = 0; count <fst_line[0]; count++){
            N[count] = user_input.nextInt();
        }
        /* Taking M (Cost of Item) as Input */
        for(int count = 0; count <fst_line[1]; count++) {
            M[count] = user_input.nextInt();
        }

    }
}