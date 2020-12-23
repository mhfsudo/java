package ch.mhf.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWritter = new FileWriter("Filename.txt");

            myWritter.write("This text will be added to the file.");
            myWritter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e)
        {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }
}