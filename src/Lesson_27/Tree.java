package Lesson_27;

public class Tree extends Plants{

    private static int TREE_GROW_PER_SEASON = 10;

    public Tree(String name, int height, int age){
        super(name, height, age);
    }

    public void doSummer(){
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getName()+ "has grown in Summer " + getHeight());
    }

    public void doAutumn() {
        System.out.println(getName() + " has not grown in Autumn - "+getHeight());
    }

    @Override
    public int getGrowPerSeason() {
        return TREE_GROW_PER_SEASON;
    }
}
