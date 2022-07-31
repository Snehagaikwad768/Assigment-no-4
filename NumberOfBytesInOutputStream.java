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
public class NumberOfBytesInOutputStream {
    public static void main(String[] args)
    {
        try {
            
            // creates object of FileOutputStream by passing
            // file Bytes.txt
            FileOutputStream FileOS
                = new FileOutputStream("C:/Bytes.txt");
  
            // creates object of DataOutputStream by
            // passing object of FileOutputStream i.e.
            // FileOS
            DataOutputStream DataOS = new DataOutputStream(FileOS);
  
            // writes the string passed to object of
            // DataOutputStream
            DataOS.writeBytes(
                 "GeeksforGeeks is the best place to learn Coding online.");
  
            // Stores the number of bytes to total_bytes
            // variable using size() method of
            // DataOutputStream class
            int total_bytes = DataOS.size();
  
            // Showing the number of bytes as output in
            // console
            DataOS.close();
  
            System.out.println("Total " + total_bytes
                        + " bytes were written to stream.");
        }
        catch (Exception e) 
        {
            System.out.println("Exception: " + e.toString());
        }
    }
}




