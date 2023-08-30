package Lesson_31;

public class Practice {
    /*
    Написать метод который принимает строку и паттерн и возвращает количество вхождений паттерна в строку
    Пример: ( "Hello World", "L") -> 3, использовать метод indexOf
     */


    public static void main(String[] args) {
        String word = "Hello World";
        String pattern = "l";

        int occurrences = CountPattern(word, pattern);
        System.out.println("Pattern '" + pattern + "' occurs " + occurrences + " times in the input string");
    }

    public static int CountPattern (String word, String pattern){
        int count = 0;
        int index = word.indexOf(pattern);

        while (index != -1){
                count++;
            index = word.indexOf(pattern,index+1);
        }
        return count;
    }




}
