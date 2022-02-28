public class Package {
    private double mass;
    private Address origin;
    private Address des;
    public Package(Address o, Address d,double m) {
        origin=o;
        des=d;
        mass=m;
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
}
