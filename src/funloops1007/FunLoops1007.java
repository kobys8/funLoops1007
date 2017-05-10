/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funloops1007;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class FunLoops1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        magicSquares();
//        System.out.println("The least common multiple of 15 and 18 is " + leastCommonMultiple(15,18));
//        System.out.println("The least common multiple of 40 and 12 is " + leastCommonMultiple(40,12));
//        System.out.println("The least common multiple of 2 and 7 is " + leastCommonMultiple(2,7));
//        System.out.println("The least common multiple of 100 and 5 is " + leastCommonMultiple(100,5));
    }
    public static void magicSquares() {
        int numFound = 0;
        double base = 0;
        double total;
        while(numFound != 4) {
            base++;
            total = 0;
            if(Math.pow(base,2) == (int)Math.pow(base,2) && Math.pow(base, 2) == Math.round(Math.sqrt(Math.pow(base,2))) * Math.round(Math.sqrt(Math.pow(base,2)))) {
                int i = 0;
                while((total != Math.pow(base,2)) && (total < Math.pow(base,2))) {
                    total += i;
                    i++;
                }
                if(total == Math.pow(base,2)) {
                    System.out.println(Math.pow(base,2) + " is a perfect square.");
                    numFound++;
                }
            }
            else {
                
            }
        }
    }
    public static int leastCommonMultiple(int n1, int n2) {
        int least = 1;
        if(n2 > n1) {
            least = n2;
        }
        else if (n1 > n2) {
            least = n1;
        }
        else if (n1 == n2) {
            return n1 * n2;
        }
        for(int i = least; i < n1 * n2; i++){
            if(i % n1 == 0 && i % n2 == 0) {
                return i;
            }
        }
        return n1*n2;
    }
}
