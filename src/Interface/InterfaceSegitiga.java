package Interface;

public class InterfaceSegitiga extends InterfaceBangunDatar {

    private double alas;
    private double tinggi;

    public InterfaceSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * alas + tinggi;
    }

    @Override
    public double hitungLuas() {
        return ((alas * tinggi) / 2);
    }

}
