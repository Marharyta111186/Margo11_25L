package Lesson_27;

public abstract class Plants {

    protected String name;
    protected int height;
    protected int age;

    public Plants(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason();


    public void doSpring() {
        addYearToAge();
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getName() + " has grown in Spring - " + getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter() {
        System.out.println(getName() + " has not grown in Winter - "+getHeight());
    }


    public void printPlantInfo() {
        System.out.println("================");

        System.out.println(getName() + " has height " + getHeight() + " and is " + getAge() + " years old");

        System.out.println();
    }
}