public class Printer {
    private Shape shape;
    public Printer(Shape shape) {
        this.shape = shape;
    }

    public void printName () {
        System.out.println(shape.getName());
    }
}
