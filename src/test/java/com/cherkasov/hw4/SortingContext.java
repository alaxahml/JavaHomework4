package com.cherkasov.hw4;

public class SortingContext {
    Sort strategy;
    SortingContext(Sort strategy)
    {
        this.strategy=strategy;
    }
    void sort(int [] a)
    {
        strategy.sort(a);
    }

}
