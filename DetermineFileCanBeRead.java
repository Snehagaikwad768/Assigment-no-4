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
public class DetermineFileCanBeRead {
    public static void main(String[] args) {
    String filePath = "E:/C.txt";
    File file = new File(filePath);

    if (file.canRead()) {
      System.out.println("File " + file.getPath() + " can be read");
    } else {
      System.out.println("File " + file.getPath() + " can not be read");
    }
  }
}

