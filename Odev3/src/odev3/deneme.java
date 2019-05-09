/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tuhanan
 */
public class deneme {
    public static void main(String[] args) throws IOException {
        File f = new File("Documents/Haydar.txt");
        if(!f.exists() || !f.isDirectory()){
            f.createNewFile();
        }
        PrintWriter pw = new PrintWriter(f);
        pw.println("ehe");
        
    }
}
