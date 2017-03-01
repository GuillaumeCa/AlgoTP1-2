package com.isep.algo.tp1.sort;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class BubbleSort extends SortUtil {

    public static void sort(int[] data) {
        if (data.length < 2) return;
        boolean hadToSwap;
        do {
            hadToSwap = false;
            for (int i = 0; i != data.length - 1; ++i) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    hadToSwap = true;
                }
            }
        } while (hadToSwap);
    }



    public static void main(String[] args) {
        int nb = 10;

        CSVUtil csv = new CSVUtil();
        csv.writeToFile("bubbleSort.csv");

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
