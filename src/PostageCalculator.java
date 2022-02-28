public class PostageCalculator {
    public static double calculatePostage(Package p){
        double ma = p.getMass();
        double tenth = ma/.1;
        double cost = 3.75+tenth*.05;
        double diff = (Math.abs(Integer.parseInt(p.getDes().getZipCode())-Integer.parseInt(p.getOrigin().getZipCode())))/100.0;
        cost+=diff;
        return cost;
    }
    public static double calculatePostage(int o,int d,double m){
        double tenth = m/.1;
        double cost = 3.75+tenth*.05;
        double diff = (Math.abs(o-d))/100.0;
        cost+=diff;
        return cost;
    }
    public static double calculatePostage(Address o, Address d, double m){
        double tenth = m/.1;
        double cost = 3.75+tenth*.05;
        double diff = (Math.abs((Integer.parseInt(o.getZipCode()))-Integer.parseInt(d.getZipCode())))/100.0;
        cost+=diff;
        return cost;
    }
}
