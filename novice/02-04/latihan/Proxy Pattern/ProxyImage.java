/**
 * ProxyImage
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String strFileName;

    public ProxyImage(String strFileName) {
        this.strFileName = strFileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(strFileName);
        }
        realImage.display();
    }
}