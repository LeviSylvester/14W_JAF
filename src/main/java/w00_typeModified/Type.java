package w00_typeModified;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Type {

    public static void type(String file) throws IOException {
        System.out.println();
        System.out.println(file + ":");
        BufferedReader toBuffer = new BufferedReader(new FileReader(file));
        for (String line; (line = toBuffer.readLine()) != null; ) {
            System.out.println(line);
        }
    }

    //apparently we can use String[] or String... as parameters with the same result
    //is there ANY difference between them?
    public static void type(String... files) throws IOException {
        for (String file : files) {
            type(file);
        }
    }
}

