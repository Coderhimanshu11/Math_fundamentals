public class OOPs {
    private int numerator;
    private int denominator;
    public OOPs(int numerator,int denominator){
        this.numerator=numerator;
        if(denominator==0){

        }
        this.denominator=denominator;
        Simplify();
    }

    public void Simplify() {
        int gcd=1;
        int smaller=Math.min(numerator,denominator);
        for (int i = 2; i <=smaller ; i++) {
            if(numerator%2==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
        Simplify();
    }

    public void setDenominator(int d) {
        if(d==0){
            return;
        }
        this.denominator = d;
        this.Simplify();
    }
    public void print(){
        if(denominator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }
    public void OOPsAdd(OOPs o2) {

            this.numerator = this.numerator * o2.denominator + this.denominator * o2.numerator;
            this.denominator = this.denominator * o2.denominator;
            Simplify();
        }
        public void multiply (OOPs o2){
            this.numerator = this.numerator * o2.numerator;
            this.denominator = this.denominator * o2.denominator;
        }
    }





