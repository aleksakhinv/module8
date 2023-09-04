public class Circle extends Shape{
    private static final float PI = 3.14f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void paint() {
        System.out.println("Circle painted in black");
    }

    @Override
    public float getArea() {
        return (float) radius * radius * PI;
    }

}
