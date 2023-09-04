public class Quad extends Shape{
    private int side;

    public Quad(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void paint() {
        System.out.println("Quad painted in red");
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
