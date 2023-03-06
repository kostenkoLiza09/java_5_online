package ua.com.alevel;

import java.io.IOException;
import java.io.BufferedReader;

public class School {

    public static void lesson(BufferedReader bufferedReader) throws IOException {
        System.out.println("You can enter the lesson number: ");
        int a = Integer.parseInt(bufferedReader.readLine());
        int startLesson = 9;
        String endLesson = ("End of the lesson: ");
        int lessonTime = 45;
        int shortBreak = a / 2;
        int longBreak = a - (shortBreak + 1);
        int time = a * lessonTime + shortBreak * 5 + longBreak * 15;
        int hour = startLesson + (time / 60); // 1 час - 60 минут
        int min = time % 60;
        System.out.println(endLesson + hour + " : " + min);
    }
}
