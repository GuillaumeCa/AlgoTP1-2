package com.isep.algo.tp1.sort;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class SelectionSort extends SortUtil {

    public static int[] array;

    public static void selectionSort() {
        if (array.length < 2) return;
        for (int i = 0; i < array.length; i++) {
            swap(array, i, minimumIndex(array, i, array.length));
        }
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

    public static void main(String[] args) {

        int nb = 10;

        CSVUtil csv = new CSVUtil();
        csv.writeToFile("selectionSort.csv");

        for (int i = 1; i < 1001; i++) {
            array = RandomData.generate1d(i * nb, 0, 500);
            long d1 = DateUtil.getPreciseTime();
            selectionSort();
            long d2 = DateUtil.getPrecisionDelta(d1);
            List<String> line = new ArrayList<>();
            line.add(i * nb + "");
            line.add(d2 + "");
            System.out.println(i * nb + " - " + d2);
            csv.addLine(line);
        }
        csv.closeFile();
    }
}
