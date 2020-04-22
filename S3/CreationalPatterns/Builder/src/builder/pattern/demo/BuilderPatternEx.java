package builder.pattern.demo;

class BuilderPatternEx {
    public static void main(String[] args){
        System.out.println("***Builder Pattern Demo***\n");
        Director director = new Director();
        IBuilder carBuilder=new Car();
        IBuilder motorBuilder=new Motorcycle();
        //Making Car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();
        //Making Motorcycle
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}
