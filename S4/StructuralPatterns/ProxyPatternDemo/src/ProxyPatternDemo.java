public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image=new ProxyImage("test_10mb.png");
        //image will be loaded from disk
        image.display();
        System.out.println(" ");

        //creates the image when needed

        //image will not be loaded from disk
        image.display();
    }
}
