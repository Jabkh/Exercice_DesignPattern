package org.example;
import java.util.List;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> composition = new ArrayList<>();
        composition.add("Jambon");
        composition.add("Champignon");


    Pizza regina = new Pizza.PizzaBuilder()
            .nomPizza("regina").taillePizza("moyenne").patePizza("fine").saucePizza("tomate")
            .compositionPizza(composition).fromagePizza("mozzarella").build();
    }


}