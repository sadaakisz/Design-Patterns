package builder.pattern.demo;

class Director {
    IBuilder myBuilder;
    //A series of steps-for the production
    public void construct(IBuilder builder){
        myBuilder=builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
