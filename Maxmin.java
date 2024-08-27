
package maxmin;

import java.util.Scanner;

public class Maxmin {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
           for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("Gia tri nho nhat trong mang: " + min);
    }
    
}
