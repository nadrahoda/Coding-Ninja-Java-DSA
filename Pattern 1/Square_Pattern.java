Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines



/**
 * Square_Pattern
 */
import java.util.Scanner;
public class Square_Pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j =1;
            while(j<=N){
                System.out.print(N);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
