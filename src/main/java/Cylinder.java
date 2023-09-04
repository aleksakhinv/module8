public class Cylinder extends Circle{
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("I'm not black");
    }

    @Override
    public float getVolume() {
        return getArea() * height;
    }
}
