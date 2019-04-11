public class Plate {
    private int plateWithFood;

    public Plate(int plateWithFood) {
        this.plateWithFood = plateWithFood;
    }

    @Override
    public String toString() {
        return "в тарелке " + plateWithFood +
                " еды.";
    }

    public boolean decreasedFood (int x) {
        if (plateWithFood < x) {
            return false;
        } else {
            plateWithFood -= x;
            return true;
        }
    }
}
