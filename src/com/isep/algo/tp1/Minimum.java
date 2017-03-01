package com.isep.algo.tp1;

import com.isep.algo.util.CSVUtil;
import com.isep.algo.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class Minimum {

    // Complexite n
    public static int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {

        int numberValues = 10_000;

        CSVUtil csv = new CSVUtil();
        csv.writeToFile("minimum.csv");

        for (int i = 1; i < 11; i++) {

            long d1 = DateUtil.getCurrentDate();
            int[] values = RandomData.generate1d(numberValues * i, 0, 500);
            long d2 = DateUtil.getCurrentDate();

            System.out.println(numberValues * i + " values : " + DateUtil.calculateTime(d1, d2) + " ms");

            List<String> data = new ArrayList<>();
            data.add(numberValues * i + "");
            data.add(DateUtil.calculateTime(d1, d2) + "");
            csv.addLine(data);
        }
        csv.closeFile();
    }
}
