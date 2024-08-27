
package sort;

import java.util.Scanner;

public class Sort {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n= scanner.nextInt();
        int[] array= new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        for (int i=0; i<n-1; i++)
        {
           // int maxi=i;
            for (int j=i+1; j<n; j++)
            {
                if (array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
      
            System.out.print("Mang sau khi sap xep: ");
            for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
    
}
