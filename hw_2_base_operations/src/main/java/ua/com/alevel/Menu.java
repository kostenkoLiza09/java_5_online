package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void start () throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Hello! Please, enter the task number and check: ");
        String select;
        menu1();
        while ((select = bufferedReader.readLine()) != null) {
            tasks(bufferedReader, select);
        }
        }

        public void menu1 (){
            System.out.println();
            System.out.println("1 - \"Sum of numbers\" ");
            System.out.println("2 - \"Letters\" ");
            System.out.println("3 - \"End of lessons\" ");
            System.out.println("4 - \"Exit\" ");
        }

        private void tasks (BufferedReader reader, String select) throws IOException {
        switch (select) {
            case "1" -> digits(reader);
            case "2" -> SumSymbols.symbols(reader);
            case "3" -> School.lesson(reader);
            case "4" -> System.exit(4);
        }
            menu1();
        }

        private void digits(BufferedReader bufferedReader) throws IOException{
            System.out.println("You can enter symbols and numbers:  ");
            SumNumbers sumNumbers = new SumNumbers();
            System.out.println("Result: " + " " + sumNumbers.numbers(bufferedReader.readLine()));
        }
}



