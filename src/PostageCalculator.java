public class PostageCalculator {
    public static double calculatePostage(Package p){
        double cost=0;
        double ma = p.getMass();
        if (ma>40){
            double greater=ma-40;
            cost+=greater;
            cost+=2;
        }
        else {
        double tenth = ma/.1;
        cost += 3.75+tenth*.05;}
        double diff = (Math.abs(Integer.parseInt(p.getDes().getZipCode())-Integer.parseInt(p.getOrigin().getZipCode())))/100.0;
        cost+=diff;
        if (p.getHeight()+p.getLength()+p.getWidth()>36){
            cost+=p.getHeight()*.1+p.getWidth()*.1+p.getLength()*.1;
        }
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
