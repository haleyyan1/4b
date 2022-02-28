public class Main {
    public static void main(String[] args) {
        Address ad1 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO","65123");
        Address ad2 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO","65223");
        Package pack = new Package(ad1,ad2,4.0);
        PostageCalculator post = new PostageCalculator();
        double c = post.calculatePostage(pack);
        System.out.print(c);
    }
}
