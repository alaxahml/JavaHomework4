package com.cherkasov.hw4;

public class BubbleSort implements  Sort {
    public void sort(int[] a) {
        for(int j=0;j<(a.length)-1;j++) {


            for (int i=0; i < (a.length) - j-1; i++) {
                 if(a[i]>a[i+1])
                 {
                     int temp=a[i];
                     a[i]=a[i+1];
                     a[i+1]=temp;
                 }
            }
        }
    }
}
