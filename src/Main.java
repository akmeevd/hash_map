import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("банан", 100, 0.5);
        Product chicken = new Product("куриное филе", 300, 1.0);
        Product chocolate = new Product("шоколад", 100, 0.1);
        Product coffee = new Product("кофе", 400, 0.2);
        Product iceCream = new Product("Мороженое", 300, 0.5);
        Product potato = new Product("Картофель", 30, 1.0);
        Product pepper = new Product("Перец", 1000, 1.0);
        Product salt = new Product("Соль", 200, 0.5);
        Recipe recipe1 = new Recipe("Мороженое с бананом и шоколадом");
        recipe1.addProduct(banana, 2);
        recipe1.addProduct(iceCream, 3);
        recipe1.addProduct(chocolate, 1);
        System.out.println(recipe1);

    }

}



