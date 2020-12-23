package ch.mhf.fileHandling;

import java.io.File;

public class DeleteFolder
{
    public static void main(String[] args)
    {
        File myFile = new File("/home/mhf/Downloads/Test");

        if (myFile.delete())
        {
            System.out.println("Deleted the folder: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
