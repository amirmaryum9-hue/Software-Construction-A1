package Fig3;

public class Cat {
    private int energy = 0;

    public void eat(Food food) {
        energy += food.getNutrition();
        System.out.println("Cat ate food and gained energy. Current energy: " + energy);
    }
}
