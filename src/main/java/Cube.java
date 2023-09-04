public class Cube extends Quad{

    public Cube(int side) {
        super(side);
    }

    @Override
    public void paint() {
        System.out.println("I'm not red");
    }

    @Override
    public float getVolume() {
        return (float) Math.pow(getSide(), 3);
    }
}
