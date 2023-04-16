package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean hasExtraCheese;
    private boolean hasExtraToppings;
    private boolean hasTakeaway;
    private boolean hasPaperbag;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = "";
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasTakeaway = false;
        this.hasPaperbag = false;
    }

    public int getPrice(){
        int total = this.price;
        if(this.hasExtraCheese) {
            total += 80;
        }
        if(this.hasExtraToppings) {
            total += this.isVeg ? 70 : 120;
        }
        if(this.hasTakeaway) {
            total += this.hasPaperbag ? 20 : 0;
        }
        return total;
    }

    public void addExtraCheese(){
        if(!this.hasExtraCheese) {
            this.hasExtraCheese = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        if(!this.hasExtraToppings) {
            this.hasExtraToppings = true;
            this.bill += "Extra Toppings Added: " + (this.isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway(){
        if(!this.hasTakeaway) {
            this.hasTakeaway = true;
            this.bill += "Paperbag Added: ";
            this.hasPaperbag = true;
            this.bill += "20\n";
        }
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: " + this.price + "\n" + this.bill;
        this.bill += "Total Price: " + this.getPrice() + "\n";
        return this.bill;
    }
}
