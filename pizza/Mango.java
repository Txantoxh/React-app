class N { // parnet class // in heritance.
    void funA() {
        System.out.println("FunA of Class N");
    }

    void funB() {
        System.out.println("FunB of Class N");
    }
}

public class Mango extends N {
    // over ridding method
    void funA() {

        super.funA(); // it is calling a parent class method
        super.funB();
        funB();
        System.out.println("FunA of Class M");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mango m = new Mango();
        m.funA();
        m.funB();

    }

}
