package Fig3;

import Fig3.Food.Sausage;
public class MainCatApp {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Food sausage = new Sausage(); // or new Fish() in the future
        myCat.eat(sausage);
    }
}