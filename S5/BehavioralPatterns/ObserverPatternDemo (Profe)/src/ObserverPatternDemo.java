public class ObserverPatternDemo {

    public static void main(String[] args) {
        BinaryObserver binaryObserver=new BinaryObserver();
        OctalObserver octalObserver=new OctalObserver();
        HexaObserver hexaObserver=new HexaObserver();

        Data data = new Data();

        data.registerObserver(binaryObserver);
        data.registerObserver(octalObserver);
        data.registerObserver(hexaObserver);

        System.out.println("First state change: 15");
        data.setState(15);

        data.unregisterObserver(octalObserver);
        System.out.println("\nSecond state change: 18");
        data.setState(18);
    }
}
