package com.isep.algo.tp2.refactoring;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.tp1.sort.SortUtil;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class SelectionSort extends SortUtil implements SortAlgo {

    public static int[] array;

    public static int[] selectionSort() {
        if (array.length < 2) return array;
        for (int i = 0; i < array.length; i++) {
            swap(array, i, minimumIndex(array, i, array.length));
        }
        return array;
    }

    public static int minimumIndex(int[] array, int begin, int end) {
        int res = begin;
        for (int i = begin + 1; i != end; i++) {
            if (array[i] < array[res]) {
                res = i;
            }
        }
        return res;
    }

    @Override
    public int[] sort(int[] data) {
        array = data;
        return selectionSort();
    }
}
