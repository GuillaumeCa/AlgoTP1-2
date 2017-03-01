package com.isep.algo.tp1.sort;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class SortUtil {
    public static int[] swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        return array;
    }
}
