package Fig3;

public interface Food {
    int getNutrition();
    
    public class Sausage implements Food {
        public int getNutrition() {
            return 10;
        }

        public String getColor() {
            return "Red";
        }

        public String getExpiration() {
            return "2025-12-31";
        }
    }

}
