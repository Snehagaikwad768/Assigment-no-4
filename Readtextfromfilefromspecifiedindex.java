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
public class Readtextfromfilefromspecifiedindex {
    public static void main(String[] args) {
    //file class object     
    File file = new File("E:/JAVA/IncludeHelp.txt");

    try {
      FileInputStream fin = new FileInputStream(file);
      int ch;

      System.out.println("File's content after 10 bytes is: ");

      //skipping 10 bytes to read the file
      fin.skip(10);

      while ((ch = fin.read()) != -1)
        System.out.print((char) ch);
    } catch (FileNotFoundException ex) {
      System.out.println("FileNotFoundException : " + ex.toString());
    } catch (IOException ioe) {
      System.out.println("IOException : " + ioe.toString());
    } catch (Exception e) {
      System.out.println("Exception: " + e.toString());
    }
  }
}

