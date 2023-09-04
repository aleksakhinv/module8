public abstract class Shape implements Paintable{
    public String getName() {
        return "This figure name is " + this.getClass().getSimpleName();
    }

    public abstract float getArea();

    public float getVolume() {
        throw new IllegalStateException(this.getClass().getSimpleName() + " does not have a Volume");
    }

}
