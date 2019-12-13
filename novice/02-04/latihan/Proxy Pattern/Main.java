/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("File_png.jpg");

        image.display(); //image diload

        image.display(); //image tidak diload
    }
}