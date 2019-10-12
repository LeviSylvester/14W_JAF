package w00_typeModified;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static w00_typeModified.Type.type;

// tema: pt fisiere .txt date ca parametri de intrare, sa se tipareasca continutul lor
// this CommandLine class tries to simulate the console

public class CommandLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.print(System.getProperty("user.dir") + "\\");
            String commandLine = scanner.nextLine();
            try {
                String[] commands = commandLine.split(" ");
                String[] files = Arrays.copyOfRange(commands, 1, commands.length, String[].class);
                switch (commands[0]) {
                    //now we only have type and exit but switch makes sense if other methods are added
                    case "type":
                        if (files.length != 0) {
                            type(files);
                        } else {
                            System.out.println("no files specified");
                        }
                        break;
                    case "exit":
                        exit = true;
                        break;
                    default:
                        System.out.println("can't recognize command");
                }
            } catch (FileNotFoundException f) {
                System.out.println("file not found");
            } catch (IllegalArgumentException i) {
                System.out.println("not a valid command");
            }
        }
        scanner.close();
    }
}
/** sample input:
type file.txt file1.txt file2.txt
*/

//toDo: 1.what could i do to continue printing next file after file not found?; 2.regex


// Commented but worth to mention:

//        int numberOfFilePaths = commands.length - 1;

//        for(int i=0; i<numberOfFilePaths;i++) {
//            type(commands[i+1]);
//        }

//                if (commands[0].equals("type")) {
//                    type(files);
//                } else if (commands[0].equals("exit")) {
////                    break;
//                    exit = true;
//                } else {
//                    System.out.println("can't recognize command");
//                }

//        try {
//            if (commands[0].equals("type")) {
//                switch (files.length) {
//                    case 1:
//                        type(commands[1]);
//                        break;
//                    case 2:
//                        type(commands[1], commands[2]);
//                        break;
//                    case 3:
//                        type(commands[1], commands[2], commands[3]);
//                        break;
//                    default:
//                        System.out.println("not a valid command");
//                }
//            } else {
//                System.out.println("not a valid command");
//            }
//        } catch (FileNotFoundException f) {
//            System.out.println("file not found");
//        }

//        File currentDirFile = new File(".");
//        String helper = currentDirFile.getAbsolutePath();
//        String currentDir = helper.substring(0, helper.length() - currentDirFile.getCanonicalPath().length());
//        System.out.println(currentDir);

//        int numberOfPaths = commandLine.split(scanner.delimiter().pattern()).length-1;

//        String commands = scanner.next();
//        String file = scanner.next();
//        String file1 = scanner.next();
//        String file2 = scanner.next();

//                if (numberOfFilePaths == 1) {
//                    type(commands[1]);
//                } else if (numberOfFilePaths == 2) {
//                    type(commands[1], commands[2]);
//                } else if (numberOfFilePaths == 3) {
//                    type(commands[1], commands[2], commands[3]);
//                } else {
//                    System.out.println("not a valid commands");
//                }