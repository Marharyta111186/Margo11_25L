package Lesson_26.Pizza_factory;

public class Main {
    /*
    проект "Pizza Factory"
    Нужно создать фабрику по производству пиццы. Фабрика должна
    уметь готовить такие виды пиццы:
    Гавайи, Салями, Моцаелла. Каждый вид пиццы должен уметь:
    готовиться(накладывать ингрииенты и т.д.
    печься
    упаковываться

    В каждом случае должно быть название
    В классе Main не должен создаваться новый обьект пиццы,
    а из него должен поступать заказ на изготовление нужного
    вида пиццы в класс PizzaFactory, который должен выбрать
    нужную пиццу для изготовления.

    Алгоритм реализации:

    1. Нужно создать родительский абстрактный класс Pizza  и
    три дочерних класса.
    2. Возможно не все методы родительского класса должны быть
    абстрактными а только те реализация которых в дочерних
    классах различна.
    3.Создать класс Pizza Factory  в котором будет осуществляться
     создание нового обьекта пицца в зависимости от выбора
    заказчика. (Switch)
     */

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza order1 = pizzaFactory.createPizza("Pizza Hawaii");
        order1.orderPizza();
        System.out.println("======================================");

        Pizza order2 = pizzaFactory.createPizza("Pizza Salami");
        order2.orderPizza();
        System.out.println("======================================");

        Pizza order3 = pizzaFactory.createPizza("Pizza Mozzarella");
        order3.orderPizza();
        System.out.println("======================================");

        Pizza order4 = pizzaFactory.createPizza("Pizza Margarita");
        order4.orderPizza();
        System.out.println("======================================");



    }
























}
