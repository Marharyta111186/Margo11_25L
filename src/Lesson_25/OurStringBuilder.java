package Lesson_25;

public class OurStringBuilder {
    public static void main(String[] args) {

    String str = "abcd";
    System.out.println(str.substring(2));
    System.out.println(str);
    str = "frtu";

    //StringBuilder используется для создания изменяемых строк
        // конструкторы:
        /*
        StringBuilder() пустой стрингбилдер
        StringBuilder(String) стрингбилдер со трокой String
        StringBuilder(int length)  пустой стрингбилдер размера length
         */

        // метод append(String s) добавляет строку к имеющейся

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append(" Java");
        System.out.println(sb);


    }

}
