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

    public void decreasedFood (int x){
        plateWithFood-=x;
    }
}
