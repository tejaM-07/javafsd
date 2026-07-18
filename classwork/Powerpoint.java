class Document {
    void print() {
        System.out.println("Printing Document");
    }
}

class PowerPointDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing PowerPoint Document");
    }
}

public class Powerpoint{
    public static void main(String[] args) {

        Document doc = new PowerPointDocument();
        doc.print();
    }
}
