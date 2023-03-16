
package Recursion;


public class DivideAndConquer {
      public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
 
        System.out.println("Value of array:");
        printArray(arr);
 
        DivideAndConquer ob = new DivideAndConquer();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nArray after merge sorting:");
        printArray(arr);
    }
  
    
    void merge(int Mainarr[], int left, int mid, int right)
    {
        int sarr1 = mid - left + 1;
        int sarr2 = right - mid;
        
        int L[] = new int [sarr1];
        int R[] = new int [sarr2];
        
        for (int i=0; i<sarr1; ++i)
            L[i] = Mainarr[left + i];
        for (int j=0; j<sarr2; ++j)
            R[j] = Mainarr[mid + 1 + j];
        
        int i = 0, j = 0;
        
        int k = left;
        while (i < sarr1 && j < sarr2)
        {
            if (L[i] <= R[j])
            {
                Mainarr[k] = L[i];
                i++;
            }
            else
            {
                Mainarr[k] = R[j];
                j++;
            }
            k++;
        }
          while (i < sarr1)
        {
            Mainarr[k] = L[i];
            i++;
            k++;
        }
          while (j < sarr2)
        {
            Mainarr[k] = R[j];
            j++;
            k++;
        }
          
 
        
        
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
             int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
            
 
        }
}
     static void printArray(int arr[])
     {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
     
     
}
