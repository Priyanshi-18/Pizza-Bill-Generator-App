public class Pizza {
    private int price;
    private boolean veg;
    private int basePizzaPrice=300;
    private int extraCheesePrice=80;
    private int extraToppingsPrice=50;
    private int parcelbagPrice=20;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedforTakeAway=false;

    public Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        } else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }
    
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price+=extraToppingsPrice;
    }
    
    public void takeAway(){
        isOptedforTakeAway=true;
        this.price+=parcelbagPrice;
    }
    
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added: "+extraCheesePrice+  "\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings added: "+extraToppingsPrice+ "\n";
        }
        if(isOptedforTakeAway){
            bill+="TakeAway: " +parcelbagPrice+ "\n";
        }
        bill+="Bill: "+this.price+ "\n";
        System.out.println(bill);
    }
}
