class Document {
    void print() {
        System.out.println("Printing Document");
    }
}

class PdfDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing PDF Document");
    }
}

public class Pdfdoc {
    public static void main(String[] args) {

        Document doc = new PdfDocument();
        doc.print();
    }
}