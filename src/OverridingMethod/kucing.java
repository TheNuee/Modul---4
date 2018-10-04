package OverridingMethod;

class kucing extends hewan {

    @Override
    void setNama() {
        String kucing = "Cerberus";
        System.out.println("Nama Kucing = " + kucing);
    }

    @Override
    void setSuara() {
        String suara = " Miaw miaw meong..";
        System.out.println("Suara Kucing = " + suara);
    }

    @Override
    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat Kucing = " + berat + "Kg");
    }

}
