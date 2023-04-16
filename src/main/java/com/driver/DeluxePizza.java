package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg)
        {
            super.addExtraCheese();
            super.addExtraToppings();
        }
        else
        {
            super.addExtraCheese();
            super.addExtraCheese();
            super.addExtraToppings();
        }
    }
}
