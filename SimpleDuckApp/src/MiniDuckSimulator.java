public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        //change the fly behaviour using setFlyBehaviour method
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
