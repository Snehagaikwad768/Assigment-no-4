/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// Importing zip classes and Scanner class
// from java.util package
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
 
public class ReadPrintfileFromZip {
    public void printFileContent(String filePath)
    {
 
       
        FileInputStream fs = null;
        ZipInputStream Zs = null;
        ZipEntry ze = null;
 
        try {
 
            
            System.out.println(
                "Files in the zip are as follows: ");
 
            fs = new FileInputStream(filePath);
            Zs = new ZipInputStream(
                new BufferedInputStream(fs));
            // Loop to read and print the zip file name till
            // the end
            while ((ze = Zs.getNextEntry()) != null) {
                System.out.println(ze.getName());
            }
 
            
            Zs.close();
        }
 
        
        catch (FileNotFoundException fe) {
 
            
            fe.printStackTrace();
        }
 
        
        catch (IOException ie) {
 
            
            ie.printStackTrace();
        }
    }
     // Main driver method
    public static void main(String[] args)
    {
 
        
        GFG zf = new GFG();
 
        
        Scanner sc = new Scanner(System.in);
 
        
        System.out.println(
            "Enter the location of the zip file: ");
        String str = sc.nextLine();
 
        
        zf.printFileContent(str);
    }
}
