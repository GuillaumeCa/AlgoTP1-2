package com.isep.algo.tp1.sort;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class MergeSort {
    public static void mergeSorted(int[] data, int begin, int middle, int end) {
        int[] tmp = new int[middle - begin];
        System.arraycopy(data, begin, tmp, 0, tmp.length);
        int i = 0, j = middle, dest = begin;
        while ((i < tmp.length) && (j < end)) {
            data[dest++] = (tmp[i] < data[j]) ? tmp[i++] : data[j++];
        }
        while (i < tmp.length) {
            data[dest++] = tmp[i++];
        }
    }

    public static void sort(int[] data, int begin, int end) {
        if ((end - begin) < 2) return;
        int middle = (end + begin) / 2;
        sort(data, begin, middle);
        sort(data, middle, end);
        mergeSorted(data, begin, middle, end);
    }

    public static void sort(int[] data) {
        sort(data, 0, data.length);
    }

    public static void main(String[] args) {
        int nb = 10;

        CSVUtil csv = new CSVUtil();
        csv.writeToFile("mergeSort.csv");

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
