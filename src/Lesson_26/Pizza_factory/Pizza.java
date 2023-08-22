package Lesson_26.Pizza_factory;

public abstract class Pizza {

    private String type;


    public  Pizza (String type){
        this.type = type;
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
        thanks();
    }

    protected abstract void prepare();

    private void bake(){
        System.out.println("Baking " + type);
    }

    private void pack(){
        System.out.println("Packing "+ type);
    }

    private void thanks(){
        System.out.println("Your order: "+ type+ " is ready! Wish you Bon Appetit!");
    }
}
