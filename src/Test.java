public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // Image will be loaded from disk
        image.display();
        System.out.println("");

        // Image will not be loaded from disk
        image.display();
    }
}
