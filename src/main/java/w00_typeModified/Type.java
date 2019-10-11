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
        type(file);
        type(otherFile);
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        BufferedReader br1 = new BufferedReader(new FileReader(otherFile));
//        System.out.println();
//        System.out.println(file + ":");
//        for (String line; (line = br.readLine()) != null; ) {
//            System.out.println(line);
//        }
//        System.out.println();
//        System.out.println(otherFile + ":");
//        for (String line; (line = br1.readLine()) != null; ) {
//            System.out.println(line);
//        }
    }

    public static void type(String file, String secondFile, String thirdFile) throws IOException {
        type(file);
        type(secondFile);
        type(thirdFile);
    }

    public static void type(String file, String secondFile, String thirdFile, String forthFile) throws IOException {
        type(file);
        type(secondFile);
        type(thirdFile);
        type(forthFile);
    }

    public static void type(String file, String secondFile, String thirdFile, String forthFile, String fifthFile)
            throws IOException {
        type(file);
        type(secondFile);
        type(thirdFile);
        type(forthFile);
        type(fifthFile);
    }
    // and so on
}

