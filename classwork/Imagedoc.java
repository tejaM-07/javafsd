class Document {
    void print() {
        System.out.println("Printing Document");
    }
}

class ImageDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing Image Document");
    }
}

public class Imagedoc {
    public static void main(String[] args) {

        Document doc = new ImageDocument();
        doc.print();
    }
}