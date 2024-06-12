
//public class BookClient {
public class BookClient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AnnualEdition ae = new AnnualEdition();
        ae.setBid(100);
        ae.setBname("Hibernate");
        ae.setBtype("ORM");
        ae.setPrice(250);
        ae.setDiscount(5);

        System.out.println(ae.getBid() + "\t" + ae.getBname() + "\t" + ae.getBtype() + "\t" + ae.getPrice() + "\t"
                + ae.getDiscount());

        oops b = new oops();
        b.setBid(101);
        b.setBname("java");
        // b.setBtype("ProgrammingLanage");
        b.setPrice(3500);
        System.out.println(b.getBid() + "\t" + b.getBname() + "\t" + "\t" + b.getPrice());

    }

}
