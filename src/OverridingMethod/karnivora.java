package OverridingMethod;

public class karnivora {

    public static void main(String[] args) {
//Cara penulisan objek: (superclass) variable = new (subclass)
        System.out.println("===== HEWAN DEFAULT =====");
        hewan h = new hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();

        System.out.println("===== HEWAN KUCING =====");
        hewan k = new kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();

        System.out.println("===== HEWAN SINGA =====");
        hewan s = new singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }

}
