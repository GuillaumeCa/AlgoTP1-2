package com.isep.algo.tp2.refactoring;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.tp1.sort.SortUtil;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class BubbleSort extends SortUtil implements SortAlgo {

    public static int[] sorter(int[] data) {
        if (data.length < 2) return new int[0];
        boolean hadToSwap;
        do {
            hadToSwap = false;
            for (int i = 0; i != data.length - 1; ++i) {
                if (data[i] > data[i + 1]) {
                    data = swap(data, i, i + 1);
                    hadToSwap = true;
                }
            }
        } while (hadToSwap);
        return data;
    }

    @Override
    public int[] sort(int[] data) {
        return BubbleSort.sorter(data);
    }
}
