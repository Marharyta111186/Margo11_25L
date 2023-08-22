package Lesson_26.Pizza_factory;

public class HawaiiPizza extends Pizza{

    private static String TYPE = "Pizza Hawaii";

    public HawaiiPizza() {
        super("Pizza Hawaii");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with pine-apple ");

    }
}
