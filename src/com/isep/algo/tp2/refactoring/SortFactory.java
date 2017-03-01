package com.isep.algo.tp2.refactoring;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class SortFactory {
    public static SortAlgo createSort(SortNames name) throws Exception {
        switch (name) {
            case SELECTION:
                return new SelectionSort();

            case BUBBLE:
                return new BubbleSort();

            default:
                throw new Exception(name.toString() + " is not a valid class");
        }
    }
}
