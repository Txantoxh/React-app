public class products {
    int pid;
    String pname;
    int qty;
    int price;

    public int getpid() {
        return pid;
    }

    public void setpid(int pid) {
        this.pid = pid;

    }

    public String getpname() {
        return pname;

    }

    public void setpname(String pname) {
        this.pname = pname;

    }

    public int getqty() {
        return qty;
    }

    public void setqty(int qty) {
        this.qty = qty;

    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;

    }

    public products(int pid, String pname, int qty, int price) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }

    public static void main(String[] args) {
        products viewProuducts = new products(2000, "Ravi", 400, 4000);
        System.out.println(viewProuducts.getpid() + " " + viewProuducts.getpname() + " " + viewProuducts.getqty() + " "
                + viewProuducts.getprice());
        

    }

}
