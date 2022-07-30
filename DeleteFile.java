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
public class DeleteFile {
    public static void main(String[] args)
    {
        File file
            = new File("C:\\Users\\Mayank\\Desktop\\1.txt");
 
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}

