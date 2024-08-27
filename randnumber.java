
package random;

import java.util.Scanner;
import java.util.Random;

public class randnumber {

  
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner =  new Scanner(System.in);
        String string;
        do
        {
            int n=rand.nextInt(100-1+1)+1;
            System.out.println(n);
            if (n%2==0)
            {
                System.out.print("la so chan");
            }
            else {
                System.out.print("la so le");
            }
            System.out.print("Nhap chuoi check (yes/no)");
            string = scanner.nextLine();
        }while (string.equals("yes"));
        
    }
    
}
