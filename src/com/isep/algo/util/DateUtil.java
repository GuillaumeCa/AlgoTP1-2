package com.isep.algo.util;

import java.util.Date;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class DateUtil {

    public static long getCurrentDate() {
        Date d = new Date();
        return d.getTime();
    }

    public static long getPreciseTime() {
        return System.nanoTime();
    }

    /**
     * Get time delta in µs
     *
     * @return
     */
    public static long getPrecisionDelta(long start) {
        return (System.nanoTime() - start) / 1000;
    }

    public static long calculateTime(long d1, long d2) {
        return d2 - d1;
    }

}
