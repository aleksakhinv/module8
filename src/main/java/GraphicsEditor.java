public class GraphicsEditor {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Printer printer = new Printer(circle);
        printer.printName();
        circle.paint();
        System.out.println("Area is " + circle.getArea());
        try {
            circle.getVolume();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("------------------------");

        Shape cylinder = new Cylinder(15,5);
        System.out.println(cylinder.getName());
        cylinder.paint();
        System.out.println("Area is " + cylinder.getArea());
        System.out.println("Volume is " + cylinder.getVolume());

        System.out.println("------------------------");

        Shape quad = new Quad(17);
        System.out.println(quad.getName());
        quad.paint();
        System.out.println("Area is " + quad.getArea());
        try {
            quad.getVolume();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("------------------------");

        Shape cube = new Cube(2);
        System.out.println(cube.getName());
        cube.paint();
        System.out.println("Area is " + cube.getArea());
        System.out.println("Volume is " + cube.getVolume());

        System.out.println("------------------------");

        Shape triangle = new Triangle(3,4,5);
        System.out.println(triangle.getName());
        triangle.paint();
        System.out.println("Area is " + triangle.getArea());
        try {
            triangle.getVolume();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
