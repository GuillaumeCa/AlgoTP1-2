package com.isep.algo.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Guillaume on 08/02/2017.
 */
public class CSVUtil {

    private PrintWriter writer;

    public void addLine(List<String> data) {
        if (writer != null) {
            String line = String.join(",", data);
            writer.println(line);
        }
    }

    public void writeToFile(String url) {
        try {
            writer = new PrintWriter(url, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        writer.close();
    }

}
