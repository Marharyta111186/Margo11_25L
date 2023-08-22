package Lesson_26.Pizza_factory;

public class MozzarellaPizza extends Pizza {

   private static String TYPE = "Pizza Mozzarella";

    public MozzarellaPizza() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozzarella cheese ");
    }
}
