package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int nonVegBasePrice=400;
    private int vegBasePrice=300;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean takeAway;
    private int vegToppings=70;
    private int nonVegToppings=120;
    private int toppingPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price=getBasePrice(isVeg);
        addExtraCheese=false;
        addExtraToppings=false;
        takeAway=false;

    }

    public int getBasePrice(Boolean isveg) {
        return isveg ? vegBasePrice:nonVegBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addExtraCheese){
            price+=80;
            addExtraCheese=true;
        }

    }

    public void addExtraToppings(){
        if(!addExtraToppings){
            if(isVeg) {
                price += vegToppings;
                toppingPrice = vegToppings;
            }
            else {
                price += nonVegToppings;
                toppingPrice = nonVegToppings;
            }
            addExtraToppings=true;
        }
    }

    public void addTakeaway(){
        if(!takeAway){
            price+=20;
            takeAway=true;
        }
    }

    public String getBill(){
       String ans="";
       ans+="Base Price Of The Pizza: "+getBasePrice(isVeg)+"\n";
       if(addExtraCheese)
           ans+="Extra Cheese Added: "+80+"\n";
       if(addExtraToppings)
           ans+="Extra Toppings Added: "+toppingPrice+"\n";
       if(takeAway)
           ans+="Paperbag Added: "+20+"\n";
       ans+="Total Price: "+price+"\n";
       this.bill=ans;
        return this.bill;

    }
}
