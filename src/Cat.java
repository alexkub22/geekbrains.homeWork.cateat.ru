public class Cat {
    private String name;
    private int food;

    public Cat(String name, int food) {
        this.name = name;
        this.food = food;
    }
    public void eat(Plate plate) {
        if (plate.decreasedFood(food)) {
            System.out.println(name + " кушает...");
            System.out.println(name+" сыта и довольна) ");
        } else {
            System.out.println(name + " не кушает! -мало еды.");
            System.out.println(name + " голодный и злой");
        }
    }

}
