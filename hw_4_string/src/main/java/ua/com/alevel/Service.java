package ua.com.alevel;

public class Service {
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reverse (String str, String dest){
        String newstr= str.replace(dest, reverse(dest));
        return newstr;
    }

    public static String reverse (String str,  int firstIndex, int lastIndex){

        String substring = str.substring(firstIndex, lastIndex + 1);
        String[] words = substring.split(" "); //split служит разделителем на пробел, делит стрингу в масив на отдельные элементы
        for(int i =0; i<words.length;i++) {
            words[i]=reverse(words[i]); //реверс массива
        }
        return str.replace(substring, String.join(" ", words));// джоин соиденяет массив строк в одну строку, первый аргумент служить разделителем
    }                                                                  //replace - заменяет
}


    


