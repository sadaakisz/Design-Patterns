public class FlyweightPatternDemo {
    public static final String colors[]={"Red", "Green", "Blue"};
    public static void main(String[] args){
        for (int i=0;i<20;i++){
            Circle circle=(Circle) ShapeFactory.getCircle(getRandomColor());
        }
        Circle.setX(1);
        Circle.setY(1);
        Circle.setRadius(100);

    }



    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
