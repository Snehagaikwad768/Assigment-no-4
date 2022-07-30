/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.FileInputStream;  
public class DataStreamExample {
    public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  


