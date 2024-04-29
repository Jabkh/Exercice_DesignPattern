package org.example;

import java.util.List;

public class Pizza {

    private String nomPizza;
    private String patePizza;
    private String taillePizza;
    private String fromagePizza;
    private List<String> compositionPizza;
    private String saucePizza;

    private Pizza(PizzaBuilder builder) {
        //#TODO affecter les variable et mettre le builder en paramètre
        this.nomPizza = builder.nomPizza;
        this.patePizza = builder.patePizza;
        this.taillePizza = builder.taillePizza;
        this.fromagePizza = builder.fromagePizza;
        this.compositionPizza = builder.compositionPizza;
        this.saucePizza = builder.saucePizza;

    }

    public static class PizzaBuilder {
        private String nomPizza;
        private String patePizza;
        private String taillePizza;
        private String fromagePizza;
        private List<String> compositionPizza;
        private String saucePizza;

        public PizzaBuilder nomPizza(String nomPizza) {
            this.nomPizza = nomPizza;
            return this;
        }

        public PizzaBuilder patePizza(String patePizza) {
            this.patePizza = patePizza;
            return this;
        }

        public PizzaBuilder taillePizza(String taillePizza) {
            this.taillePizza = taillePizza;
            return this;
        }

        public PizzaBuilder fromagePizza(String fromagePizza) {
            this.fromagePizza = fromagePizza;
            return this;
        }

        public PizzaBuilder compositionPizza(List<String> compositionPizza) {
            this.compositionPizza = compositionPizza;
            return this;
        }

        public PizzaBuilder saucePizza(String saucePizza) {
            this.saucePizza = saucePizza;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

}
