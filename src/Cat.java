public class Cat {
    private String name;
    private int food;

    public Cat(String name, int food) {
        this.name = name;
        this.food = food;
    }
    public void eat(Plate plate){
        plate.decreasedFood(food);
        System.out.println(name+" кушает...");
    }

}
