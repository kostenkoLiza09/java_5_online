package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class SumSymbols {
    public static void symbols(BufferedReader bufferedReader) throws IOException {

        System.out.println("You can enter symbols and numbers: ");
        String st = bufferedReader.readLine();
        ArrayList<Character> chars = new ArrayList<Character>(); //создаём лист( туда нужно по очереди добавлять буквы, которые мы уже прошли)
        for(int i =0; i <st.length(); i++){ //используем цикл
            final char cha = st.charAt(i); //это нужно для лямбды выражения потому что там хочет const
            if(Character.isLetter(cha) && !chars.contains(cha)){ // проводим проверку (наш символ является буквой и не проходились ли мы ещё по нему)
                System.out.println(cha + " - "+st.chars().filter(ch -> ch == cha).count()); // считаем сколько раз встречается символ (проводим фильтрацию)
                chars.add(st.charAt(i) ); // добавляем чары в лист, потому что мы уже по ним прошлись
            }
        }
    }
}
