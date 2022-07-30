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
public class GetFilePathAndSize {
    public static void main(String args[]) {
    final String fileName = "file1.txt";
    try {
      //File Object
      File objFile = new File(fileName);

      //getting file path
      System.out.println("File path is: " + objFile.getAbsolutePath());
      //getting filesize
      System.out.println("File size is: " + objFile.length() + " bytes.");
    } catch (Exception Ex) {
      System.out.println("Exception: " + Ex.toString());
    }

  }
}

