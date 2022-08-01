/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.*;

public class PrintFile {
    public static void main(String args[]) throws IOException {
    File fileName = new File("d:/sample.txt");

    FileInputStream inFile = new FileInputStream("d:/sample.txt");
    int fileLength = (int) fileName.length();

    byte Bytes[] = new byte[fileLength];

    System.out.println("File size is: " + inFile.read(Bytes));

    String file1 = new String(Bytes);
    System.out.println("File content is:\n" + file1);

    //close file
    inFile.close();
  }
}
