package w00_typeModified;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Type {

    public static void type(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println();
        System.out.println(file + ":");
        for (String line; (line = br.readLine()) != null; ) {
            System.out.println(line);
        }
    }

    public static void type(String file, String otherFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br1 = new BufferedReader(new FileReader(otherFile));
        System.out.println();
        System.out.println(file + ":");
        for (String line; (line = br.readLine()) != null; ) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println(otherFile + ":");
        for (String line; (line = br1.readLine()) != null; ) {
            System.out.println(line);
        }
    }

    public static void type(String file, String secondFile, String thirdFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br1 = new BufferedReader(new FileReader(secondFile));
        BufferedReader br2 = new BufferedReader(new FileReader(thirdFile));
        System.out.println();
        System.out.println(file + ":");
        for (String line; (line = br.readLine()) != null; ) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println(secondFile + ":");
        for (String line; (line = br1.readLine()) != null; ) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println(thirdFile + ":");
        for (String line; (line = br2.readLine()) != null; ) {
            System.out.println(line);
        }
    }
}

