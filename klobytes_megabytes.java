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
public class klobytes_megabytes {
    public static void main(String[] args)
    {
        // create file object enter the path of
        // the file for which size is to be found
        File file = new File("/home/user/GFG.txt");
        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = (bytes / 1024);
  
            // converting file size to bytes to kb
            double megabytes = (kilobytes / 1024);
  
            // converting file size tolb to mb
            double gigabytes = (megabytes / 1024);
  
            System.out.println("bytes : " + bytes);
            System.out.println("kilobytes : " + kilobytes);
            System.out.println("megabytes : " + megabytes);
        }
        else {
            System.out.println("File does not exists!");
        }
    }
}

