package com.cherkasov.hw4;

public class Main {
    public static void main(String[] args) {
        int [] array={4,51,2,4,5,90,-2,1,-6};
      Sort sortStrategy1=new SelectionSort();
      SortingContext context1=new SortingContext(sortStrategy1);
      context1.sort(array);
      /*Sort sortStrategy2=new BubbleSort();
      SortingContext context2=new SortingContext(sortStrategy2);
      context2.sort(array);*/
      for(int i=0;i<array.length;i++)
      {
          System.out.println(array[i]);
      }
    }
}
