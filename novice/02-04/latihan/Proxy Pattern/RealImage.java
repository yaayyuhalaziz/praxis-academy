/**
 * RealImage
 */
public class RealImage implements Image {
    private String strFileName;

    public RealImage(String strFileName) {
        this.strFileName = strFileName;
        loadFromDisk(strFileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying\t" +strFileName);
    }

    public void loadFromDisk(String strFiString) {
        System.out.println("Loading\t" + strFileName);
    }
}