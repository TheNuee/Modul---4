package OverridingMethod;

class singa extends hewan {

    @Override
    void setNama() {
        String singa = "Diablo";
        System.out.println("Nama Singa = " + singa);
    }

    @Override
    void setSuara() {
        String suara = " Roaaaarrrr...";
        System.out.println("Suara Singa = " + suara);
    }

    @Override
    void setBerat() {
        double berat = 10.0;
        System.out.println("Berat Singa = " + berat + "Kg");
    }

}
