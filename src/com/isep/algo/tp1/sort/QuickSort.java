package com.isep.algo.tp1.sort;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class QuickSort extends SortUtil {
    public static int partition(int[] data, int begin, int end, int pivotIdx) {
        swap(data, pivotIdx, --end);
        pivotIdx = end;
        int pivot = data[pivotIdx];
        // invariant is that everything before begin is known to be < pivot
        // and everything after end is known to be >= pivot
        while (begin != end) {
            if (data[begin] >= pivot) {
                swap(data, begin, --end);
            } else {
                ++begin;
            }
        }
        swap(data, pivotIdx, begin);
        return begin;
    }

    public static void sort(int[] data, int begin, int end) {
        if ((end - begin) < 2) return;
        int m = partition(data, begin, end, (end + begin) / 2);
        sort(data, begin, m);
        sort(data, m + 1, end); // +1 for convergence
    }

    public static void sort(int[] data) {
        sort(data, 0, data.length);
    }

    public static void main(String[] args) {
        int nb = 10;

        CSVUtil csv = new CSVUtil();
        csv.writeToFile("quickSort.csv");

        for (int i = 1; i < 1001; i++) {
            int[] array = RandomData.generate1d(i * nb, 0, 500);
            long d1 = DateUtil.getPreciseTime();
            sort(array);
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
