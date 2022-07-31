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
public class FileishiddenorNot {
    public static void main(String[] args) {
      try {
         File file = new File("demo1.txt");
         file.createNewFile();
         System.out.println("Is file hidden? " + file.isHidden());
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}
