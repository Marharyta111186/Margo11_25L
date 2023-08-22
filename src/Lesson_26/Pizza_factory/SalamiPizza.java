package Lesson_26.Pizza_factory;

public class SalamiPizza extends Pizza{

    private static String TYPE = "Pizza Salami";

    public SalamiPizza(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with Salami ");
    }


}
