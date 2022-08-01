/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Scanner;

public class OwnerOfFile {
    public static void main(String[] args) throws Exception {
    // create object of scanner.
    Scanner KB = new Scanner(System.in);

    // enter path here.
    System.out.print("Enter the file path : ");
    String A = KB.next();
    Path path = Paths.get(A);

    // create object of file attribute.
    FileOwnerAttributeView view = Files.getFileAttributeView(path,
      FileOwnerAttributeView.class);

    // this will get the owner information.
    UserPrincipal userPrincipal = view.getOwner();

    // print information.
    System.out.println("Owner of the file is :" + userPrincipal.getName());
  }
}

