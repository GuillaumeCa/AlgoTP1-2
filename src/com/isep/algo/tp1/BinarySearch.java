package com.isep.algo.tp1;

import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.*;

/**
 * Created by Guillaume on 19/02/2017.
 */
public class BinarySearch {
    public static int indexOfOrdered(int[] data, int v) {
        int res = lowerBound(data, v);
        if ((res == data.length) || (data[res] != v)) {
            res = -1;
        }
        return res;
    }

    // index of first element >= v
    public static int lowerBound(int[] data, int v) {
        return lowerBound(data, v, 0, data.length);
    }

    public static int lowerBound(int[] data, int v, int begin, int end) {
        if (begin == end) return begin;
        int m = (begin + end) / 2;
        return data[m] < v ? lowerBound(data, v, m + 1, end) : lowerBound(data, v, begin, m);
    }

    public static int lowerBoundTCO(int[] data, int v) {
        int begin = 0, end = data.length;
        while (begin != end) {
            int m = (begin + end) / 2;
            if (data[m] < v) {
                begin = m + 1;
            } else {
                end = m;
            }
        }
        return begin;
    }

    public static void main(String[] args) {

        int iterations = 100_000;
        CSVUtil csv = new CSVUtil();
        csv.writeToFile("binarySearch.csv");

        for (int i = 1; i < 100; i++) {
            int[] data = new int[i * iterations];
            Random rnd = new Random();
            for (int j = 0; j != data.length; ++j) {
                data[j] = 2 * j;
            }

            //System.out.println(Arrays.toString(data));
            int rndIndex = rnd.nextInt(data.length);

            long start = DateUtil.getPreciseTime();
            lowerBound(data, data[rndIndex]);
            long delta = DateUtil.getPrecisionDelta(start);

            //System.out.println("index of number: " + );
            System.out.println("Durée: "+ delta);

            List<String> bench = new ArrayList<>();
            bench.add(iterations * i + "");
            bench.add(delta + "");
            csv.addLine(bench);
        }
        csv.closeFile();
    }

}
