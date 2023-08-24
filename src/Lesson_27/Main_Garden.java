package Lesson_27;

public class Main_Garden {

    public static void growPlants(Plants[] plants, int years) {
        for (int year = 0; year < years; year++) {
            System.out.println("Year " + (year + 1) + ":");

            for (Plants plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }



    }
    public static void main(String[] args) {

        Plants[] plants = {new Tree("Pine tree", 100, 1)};

        growPlants(plants, 5);

        for (Plants plant : plants) {
            plant.printPlantInfo();
        }

        Plants[] plants1 = {new Flower("Tulips", 20, 1)};

        growPlants(plants1, 5);

        for (Plants plant : plants1) {
            plant.printPlantInfo();
        }

//

    }
}
