public class Address {
    private String streetNumber="";
    private String streetName;
    private String apNum;
    private String city;
    private String state;
    private String zipCode;
    public Address(String streetN, String streetNa, String apNu, String cit, String stat, String zip) {
        streetNumber+=streetN;
        streetName=streetNa;
        apNum=apNu;
        city=cit;
        state=stat;
        zipCode=zip;
    }
    public Address(String ad){
        String add=ad;
        if (ad.indexOf("Apt")!=-1) {
            String apt = ad;
            int apa=apt.indexOf("A");
            apt=apt.substring(apa);
            int end=apt.indexOf(",");
            apNum=apt.substring(0,end);
        }
        else {
            apNum="";
        }
        int number= add.indexOf(" ");
        streetNumber=add.substring(0,number);
        add=add.substring(number+1);
        int name = ad.indexOf(",");
        streetName=add.substring(0,name);
        add=add.substring(name+2);
        int cit=add.indexOf(",");
        city=add.substring(0,cit);
        add=add.substring(cit+2);
        int sta=add.indexOf(" ");
        state=add.substring(0,sta);
        zipCode=add.substring(sta+1);
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getApNum() {
        return apNum;
    }
    public String getCity() {
        return city;
    }
    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return streetNumber+" "+streetName+" "+apNum+", "city+state+zipCode;
    }
}
