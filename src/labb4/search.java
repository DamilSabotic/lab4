package labb4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class search {

	public static void main(String[] args) {
        String word = args[0];
        String path = args[1];
        
        try {
            BufferedReader fReader = new BufferedReader(new FileReader(path));
            
            String currentLine;
            
            while ((currentLine = fReader.readLine()) != null) {
                if (currentLine.contains(word)) {
                    System.out.println(currentLine);
                }
            }
            
            
            
            
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
