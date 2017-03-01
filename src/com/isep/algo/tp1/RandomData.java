package com.isep.algo.tp1;

import java.util.Random;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class RandomData {
    public static int[] generate1d(int nbVals, int min, int max) {
        int[] res = new int[nbVals];
        Random generator = new Random();
        for (int i = 0; i != nbVals; ++i) {
            res[i] = (int) ((generator.nextLong() % ((long) max - min)) + min);
        }
        return res;
    }
}
