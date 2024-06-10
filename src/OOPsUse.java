public class OOPsUse {
    public static void main(String[] args) {
        OOPs o1=new OOPs(20,10);
        o1.print();
        o1.setNumerator(80);
        o1.setDenominator(10);
        o1.print();
        OOPs o3=new OOPs(3,4);
        o1.OOPsAdd(o3);
        o1.print();
        OOPs o4=new OOPs(8,9);
        o1.multiply(o4);
        o1.print();
    }
}
