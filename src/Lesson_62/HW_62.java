package Lesson_62;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HW_62 {
    /*

 Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать дату, которая была на год раньше сегодняшней используя метод minus
Создать дату на год позже сегодняшней используя plus метод
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней
и поздней датами
     */

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date is: " + localDate);
        System.out.println("------------------------------");

        LocalDate localYearMonthDay =LocalDate.of(2023, 10,12);
        System.out.println("Local Year Month Day is : " +localYearMonthDay);
        System.out.println("------------------------------");

        LocalDate myBirthDay;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.M.yyyy");
        myBirthDay = LocalDate.of(1986,11,11);
        String res = dateTimeFormatter.format(myBirthDay);
        System.out.println("My birthday is : " + res);
        System.out.println("------------------------------");

        LocalDate date1 = LocalDate.of(2005,05,05);
        LocalDate date2 = LocalDate.of(2006,06,06);
        if (date1.equals(date2)) {
            System.out.println("date1 : " +date1+ " and" + date2 + " date2 equals !");
        }else {
            System.out.println("date1 : " +date1+ " and " + date2 + " date2 NOT equals !");
        }
        System.out.println("------------------------------");

        LocalTime localTime = LocalTime.now();
        System.out.println("Time is " + localTime);
        System.out.println("------------------------------");

        LocalTime localTime1 = LocalTime.now();
        System.out.println("Current time + 3 hours: " + localTime1.plusHours(3));
        System.out.println("------------------------------");

        LocalDate datePlusWeek = localDate.plusWeeks(1);
        System.out.println("Current Date + 1 week is : " + datePlusWeek);
        System.out.println("------------------------------");

        LocalDate dateMinusOneYear = localDate.minusYears(1);
        System.out.println("Current Date - one year is : " + dateMinusOneYear);
        System.out.println("------------------------------");

        LocalDate datePlusOneYear = localDate.plusYears(1);
        System.out.println("Current Date + one year is : " + datePlusOneYear);
        System.out.println("------------------------------");

        LocalDate dateNow = LocalDate.now();
        LocalDate tomorrow = dateNow.plusDays(1);
        LocalDate yesterday = dateNow.minusDays(1);
        System.out.println("Is tomorrow after today ? " + tomorrow.isAfter(dateNow));
        System.out.println("Is yesterday before today ? " + yesterday.isBefore(dateNow));
        System.out.println("------------------------------");

        List<LocalDate> dateList = List.of(
                LocalDate.of(2023,05,05),
                LocalDate.of(2023,05,20),
                LocalDate.of(2023,05,10)
        );
        int daysBetween = daysBetweenMinAndMaxDate(dateList);
        System.out.println("days between " + daysBetween);


    }

    /*
    Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней
и поздней датами
     */

    public static int daysBetweenMinAndMaxDate (List<LocalDate> dateList){
        LocalDate minDate = Collections.min(dateList);
        LocalDate maxDate = Collections.max(dateList);
        int daysBetween =(int) ChronoUnit.DAYS.between(minDate,maxDate);
        return daysBetween;
    }




}
