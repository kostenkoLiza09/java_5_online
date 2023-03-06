package ua.com.alevel.controller;

import ua.com.alevel.entity.Cat;
import ua.com.alevel.service.CatService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CatController {
    private final CatService catService = new CatService();

    public void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select options: \n");
        String select;
        menu();
        while ((select = bufferedReader.readLine()) !=null){
            crud(bufferedReader, select);
        }
    }

    public void menu() {
        System.out.println("--------------------------------------------");
        System.out.println("If you want create cat, please enter - 1");
        System.out.println("If you want update cat, please enter - 2");
        System.out.println("If you want delete cat, please enter - 3");
        System.out.println("If you want find cat, please enter - 4");
        System.out.println("If you want find all cats, please enter - 5");
        System.out.println("If you want close, please enter - 0");
        System.out.println("--------------------------------------------");
    }

    private void crud (BufferedReader reader, String select) throws IOException {
        switch (select){
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll(reader);
            case "6" -> System.exit(0);
        }
        menu();
    }

    private void update (BufferedReader reader) throws IOException {
        System.out.println("Please enter the id to update:");
        String id = reader.readLine();
        System.out.println("Please enter a new breed: ");
        String breed = reader.readLine();
        System.out.println("Please enter a new name: ");
        String name = reader.readLine();
        System.out.println("Please enter a new age: ");
        String stringAge = reader.readLine();
        int age = Integer.parseInt(stringAge);
        Cat s = catService.findById(id);
        s.setBreed(breed);
        s.setName(name);
        s.setAge(age);
        catService.update(s);
    }
    private void delete (BufferedReader reader) throws IOException {
        System.out.println("Enter the id of the cat you want to delete: ");
        String id = reader.readLine();
        catService.delete(id);
    }

    private void create(BufferedReader reader) throws IOException {
        System.out.println("Please enter the breed of the cat: ");
        String breed = reader.readLine();
        System.out.println("Please enter the name of the cat: ");
        String name = reader.readLine();
        System.out.println("Please enter the cat's age: ");
        String stringAge = reader.readLine();
        int age = Integer.parseInt(stringAge);
        Cat cat = new Cat();
        cat.setBreed(breed);
        cat.setName(name);
        cat.setAge(age);
        catService.create(cat);
    }

    private void findById(BufferedReader reader) throws IOException {
        System.out.println("Please enter the id: ");
        String id = reader.readLine();
        Cat cat = catService.findById(id);
        System.out.printf("Cat = " + cat);
    }

    private void findAll(BufferedReader reader){
        ArrayList<Cat> cats = catService.findAll();
        for (Cat cat : cats) {
            System.out.println("Cat = " + cat);

        }
    }
}
