package com.constructor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Filecreate {
    public static void main(String[] args) {
        String data ="welcome to java programming";
        try{
            FileOutputStream File =new FileOutputStream("Sample.txt");
            byte b[]=data.getBytes();
            File.write(b);
            File.close();
            System.out.println("file created succesfully");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
