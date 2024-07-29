package com.fileInputOutput;

import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        String[] names = {"John","Carl","Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.write("\nHere is another line");
            for (String name : names){
                writer.write("\n"+name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader( new FileReader("output.txt"));
            try {
                while (true){
                    if (reader.readLine() == null){
                        break;
                    }else {
                        System.out.println(reader.readLine());
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
