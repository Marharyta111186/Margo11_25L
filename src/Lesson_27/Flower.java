package Lesson_27;

public class Flower extends Plants{

    private static int FLOWER_GROW_PER_SEASON = 6;

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    public void doSummer(){
        System.out.println(getName()+ " bloom in Summer ");
    }

    public void doAutumn() {
        setHeight(0);
        System.out.println(getName() + " has not grown in Autumn, they cut tu zero - "+getHeight());
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }
}
