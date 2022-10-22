import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private Integer sum = 0;
    private String name;
    private HashMap<Product, Integer> recipe = new HashMap<>();


    public Recipe(String name) {
        this.name = name;
    }


    public void addProduct(Product product, Integer integer) {
        if (integer == null || product == null) {
            throw new IllegalArgumentException("Заполните все поля");
        }
        if (integer > 0) {
            recipe.put(product, integer);
            sum = sum + product.getCost() * integer;
        } else {
            throw new IllegalArgumentException("Укажите количество продукта " + product.getName());
        }


    }


    public String getName() {
        return name;
    }

    public Integer getSum() {
        return sum;
    }

    public HashMap<Product, Integer> getRecipe() {
        return recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(sum, recipe.sum) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, name);
    }

    @Override
    public String toString() {
        return "Название рецепта" + name + ". Содержит продукты - " + recipe.keySet() + ". Стоимость продуктов - " + sum;
    }
}
