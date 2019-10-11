package w00_typeModified;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static w00_typeModified.Type.type;

// tema: pt fisiere .txt date ca parametri de intrare, sa se tipareasca continutul lor
// this CommandLine class tries to simulate the console
// type command currently accepts max 5 file paths separated with space (but it can support easily even more)
public class CommandLine {

    public static void main(String[] args) throws IOException {

        System.out.print(System.getProperty("user.dir") + "\\");

        Scanner scanner = new Scanner(System.in);
        String commandLine = scanner.nextLine();

        String[] command = commandLine.split(" ");
        int numberOfFilePaths = command.length - 1;

        try {
            if (command[0].equals("type")) {
                switch (numberOfFilePaths) {
                    case 1:
                        type(command[1]);
                        break;
                    case 2:
                        type(command[1], command[2]);
                        break;
                    case 3:
                        type(command[1], command[2], command[3]);
                        break;
                    default:
                        System.out.println("not a valid command");
                }
            } else {
                System.out.println("not a valid command");
            }
        } catch (FileNotFoundException f) {
            System.out.println("file not found");
        }
        /* sample input:
type file.txt file1.txt file2.txt */

        //toDo: regex; build a method that increments type method's accepted file paths to as many as entered

        // Commented but worth to mention:

//        File currentDirFile = new File(".");
//        String helper = currentDirFile.getAbsolutePath();
//        String currentDir = helper.substring(0, helper.length() - currentDirFile.getCanonicalPath().length());
//        System.out.println(currentDir);

//        int numberOfPaths = commandLine.split(scanner.delimiter().pattern()).length-1;

//        String command = scanner.next();
//        String file = scanner.next();
//        String file1 = scanner.next();
//        String file2 = scanner.next();

//                if (numberOfFilePaths == 1) {
//                    type(command[1]);
//                } else if (numberOfFilePaths == 2) {
//                    type(command[1], command[2]);
//                } else if (numberOfFilePaths == 3) {
//                    type(command[1], command[2], command[3]);
//                } else {
//                    System.out.println("not a valid command");
//                }
    }
}
