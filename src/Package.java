public class Package {
    private double mass;
    private Address origin;
    private Address des;
    private int length;
    private int width;
    private int height;
    public Package(Address o, Address d,double m, int l,int w,int h) {
        origin=o;
        des=d;
        mass=m;
        length=l;
        width=w;
        height=h;
    }

    public Address getDes() {
        return des;
    }

    public Address getOrigin() {
        return origin;
    }

    public double getMass() {
        return mass;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
