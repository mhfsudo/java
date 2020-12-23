package ch.mhf.fileHandling;

/*
    canRead()
    canWrite()
    createNewFile()
    delete()
    exists()
    getName()
    getAbsolutPath()
    length()
    list()
    mkdir()
 */

import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args)
    {
        try
        {
            File myFile = new File("Filename.txt");             // "/home/mhf/Downloads/Filename.txt"

            if (myFile.createNewFile())
            {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e)
        {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }
}