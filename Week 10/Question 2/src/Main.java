public class Main {
    static void main() {
        Edible e = new Edible();
        Edible.Fruit.fruitDetails();
        Edible.Fruit f = new Edible.Fruit();
        f.fruitPackaging();

        System.out.println("------------------------------");

        Edible.Vegetables.vegetableDetails();
        Edible.Vegetables v = new Edible.Vegetables();
        v.vegetablePackaging();
    }
}
