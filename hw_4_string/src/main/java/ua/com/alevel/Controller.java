package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    public void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select options: \n");
        String select;
        menu();
        while ((select = bufferedReader.readLine()) != null) {
            tasks(bufferedReader, select);
        }
    }

    public void menu() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("If you want to return a string in reverse, please enter - 1");
        System.out.println("If you want to return a reverse by substring in a string, please enter - 2");
        System.out.println("If you want to return a reverse by substring in a string + index, please enter - 3");
        System.out.println("If you want close, please enter - 0");
        System.out.println("------------------------------------------------------------------------------------");
    }

    private void tasks(BufferedReader reader, String select) throws IOException {
        switch (select) {
            case "1" -> string(reader);
            case "2" ->string1(reader);
            case "3" ->string2(reader);
            case "4" -> System.exit(0);
        }
        menu();
    }

    private void string(BufferedReader reader) throws IOException {
        System.out.println("Enter some phrase:");
        String st = reader.readLine();
        System.out.println("Your result = " + Service.reverse(st));
    }

    private void string1(BufferedReader reader) throws IOException {
        System.out.println("Enter some phrase:");
        String st = reader.readLine();
        System.out.println("Enter substring to reverse:");
        String dest = reader.readLine();
        System.out.println("Your result = " + Service.reverse(st, dest));
    }

    private void string2(BufferedReader reader) throws IOException {
        System.out.println("Enter some phrase:");
        String st = reader.readLine();
        System.out.println("Enter first index of substring: ");
        int first = Integer.parseInt(reader.readLine()); //parseInt - считывает стрингу и конвертирует её в интовое
        System.out.println("Enter last index of substring: ");
        int last = Integer.parseInt(reader.readLine());
        System.out.println("Your result = " + Service.reverse(st, first, last));
    }
}