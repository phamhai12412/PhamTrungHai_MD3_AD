package model;

public class Giohang {

   private Product spgh;

    public Giohang(Product spgh) {
        this.spgh = spgh;
    }

    public Giohang() {
    }

    public Product getSpgh() {
        return spgh;
    }

    public void setSpgh(Product spgh) {
        this.spgh = spgh;
    }

    @Override
    public String toString() {
        return "Giohang{" +
                "spgh=" + spgh +
                '}';
    }
}
