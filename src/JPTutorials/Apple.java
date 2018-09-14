package JPTutorials;

public class Apple implements FoodItemInterfance, FruitItemInterface {

    @Override
    public String getName() {
        return "Apple LOL";
    }

    @Override
    public String getTexture() {
        return "Silky Smooth";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public boolean isCitrus() {
        return false;
    }
}

