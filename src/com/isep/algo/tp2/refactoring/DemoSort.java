package com.isep.algo.tp2.refactoring;

import com.isep.algo.tp1.RandomData;
import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class DemoSort {
    public static void main(String[] args) throws Exception {
        SortAlgo selectionSort = SortFactory.createSort(SortNames.SELECTION);
        SortAlgo bubbleSort = SortFactory.createSort(SortNames.BUBBLE);

        final int NB_VAL = 10;
        CSVUtil csv = new CSVUtil();
        csv.writeToFile("bubbleSort.csv");

        for (int i = 1; i < 1001; i++) {
            int[] array = RandomData.generate1d(i * NB_VAL, 0, 500);
            long d1 = DateUtil.getPreciseTime();
            bubbleSort.sort(array);
            long d2 = DateUtil.getPrecisionDelta(d1);
            List<String> line = new ArrayList<>();

            line.add(i * NB_VAL + "");
            line.add(d2 + "");
            System.out.println(i * NB_VAL + " - " + d2);
            csv.addLine(line);
        }
        csv.closeFile();
    }
}
