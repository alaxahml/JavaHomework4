package com.cherkasov.hw4;

public class SelectionSort implements Sort {
    public void sort(int[] a) {
     for(int i=0;i<(a.length)-1;i++)
     {
         int min=a[i];
         int minnum=i;
         for(int j=i+1;j<a.length;j++)
         {
             if(a[j]<min)
             {
                 min=a[j];
                 minnum=j;
             }
         }
         if(i!=minnum) {
             int temp = a[i];
             a[i] = min;
             a[minnum] = temp;
         }

     }
    }
}
