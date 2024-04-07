package ch.mhf.input;

import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userName = object.nextLine();
        System.out.println("Username: " + userName);
    }
}
