
package tongvatrungbinh;

import java.util.Scanner;

public class Tongvatrungbinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n= scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Nhap phan thu "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        int sum=0;
        int avg=0;
        for (int i=0; i<n; i++)
        {
            sum+=array[i];
        }
        for (int i=0; i<n; i++)
        {
            avg=sum/n;
        }
            System.out.println("Tong: "+sum);
            System.out.println("Trung binh cong: "+avg);
    }
    
}
