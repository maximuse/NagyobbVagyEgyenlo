package hu.nyirszikszi.nagyobbvagyegyenlo;

public class NagyobbVagyEgyenlo {
    private int a;
    private int b;

    public NagyobbVagyEgyenlo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getEredmeny() {
        if(this.a>this.b) {
            return "A(z)" + this.a + " nagyobb, mint a(z) " + this.b + ".";
        }
        else if(this.a<this.b) {
            return "A(z)" + this.a + " kissebb, mint a(z) " + this.b + ".";
        }
        else {
            return "A(z)" + this.a + " és a(z) " + this.b + " egyenlő.";
        }
    }
}