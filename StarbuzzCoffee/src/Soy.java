public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL){
            cost += 0.10;
        }else if (beverage.getSize() == Size.GRANDE){
            cost += 0.15;
        }else if (beverage.getSize() == Size.VENTI){
            cost += 0.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        //System.out.println(beverage.getSize());
        String size = "No Size";
        if (beverage.getSize() == Size.TALL){
            size = "Small";
        }else if (beverage.getSize() == Size.GRANDE){
            size = "Medium";
        }else if (beverage.getSize() == Size.VENTI){
            size = "Large";
        }
        return beverage.getDescription() + ", Soy(" + size + ")";
    }
}
