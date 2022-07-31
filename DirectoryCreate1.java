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
public class DirectoryCreate1 {
    public static void main(String[] args) {

        String dir = "/home/mkyong/test2/test3/test4/";

        File file = new File(dir);

        // true if the directory was created, false otherwise
        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }

    }

}

