public class Closet {

    private Jacket j;
    private Shirt s;
    private Pants p;
    private Footwear f;

    public Closet() {
        j = new Jacket();
        s = new Shirt();
        p = new Pants();
        f = new Footwear();
    }

    public Closet(Jacket j, Shirt s, Pants p, Footwear f) {
        this.j = j;
        this.s = s;
        this.p = p;
        this.f = f;
    }

    public Jacket getJ() {
        return j;
    }

    public void setJ(Jacket j) {
        this.j = j;
    }

    public Shirt getS() {
        return s;
    }

    public void setS(Shirt s) {
        this.s = s;
    }

    public Pants getP() {
        return p;
    }

    public void setP(Pants p) {
        this.p = p;
    }

    public Footwear getF() {
        return f;
    }

    public void setF(Footwear f) {
        this.f = f;
    }
}
