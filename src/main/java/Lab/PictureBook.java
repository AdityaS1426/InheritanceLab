package Lab;

public class PictureBook extends Book {
    private String illustrator;
    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }
    public String toString() {
        return super.toString() + " & is illustrated by " + illustrator + ".";
    }
}
