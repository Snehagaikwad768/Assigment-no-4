/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.File;
public class TraverseDirectory {
    public static void displayFiles(File[] files)
    {
        // Traversing through the files array
        for (File filename : files) {
            // If a sub directory is found,
            // print the name of the sub directory
            if (filename.isDirectory()) {
                System.out.println("Directory: "
                                   + filename.getName());
 
                // and call the displayFiles function
                // recursively to list files present
                // in sub directory
                displayFiles(filename.listFiles());
            }
 
            // Printing the file name present in given path
            else {
                // Getting the file name
                System.out.println("File: "
                                   + filename.getName());
            }
        }
        }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Storing the name of files and directories
        // in an array of File type
        File[] files = new File("C:\\GFG").listFiles();
 
        // Calling method 1 to
        // display files
        displayFiles(files);
    }
}

