package Lesson_26.Pizza_factory;

public class PizzaFactory {
    public Pizza createPizza(String TYPE){
        Pizza pizza =null;
        switch (TYPE){
            case "Pizza Mozzarella":
                pizza = new MozzarellaPizza();
                break;
            case "Pizza Salami":
                pizza = new SalamiPizza();
                break;
            case "Pizza Hawaii":
                pizza = new HawaiiPizza();
                break;
            default:
                System.out.println("Sorry, we don't have that type of pizza !");
        }
        return pizza;

    }
}
