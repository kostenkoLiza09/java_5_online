package ua.com.alevel;

import ua.com.alevel.controller.CatController;

import java.io.IOException;

public class CatStart {
    public static void main(String[] args) throws IOException {
        CatController controller = new CatController();
        controller.start();
    }
}