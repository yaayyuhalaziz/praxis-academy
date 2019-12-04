class BangunDatar {
    public void getLuas(String bangun) {
        System.out.print("Luas "+bangun+" ");
    }

    public void getKeliling(String bangun) {
        System.out.print("Keliling "+bangun+" ");
    }
}

interface VarPHI {
    final float decPhi = 3.14;
}

class Persegi extends BangunDatar {
    public float sisi;

    public float getLuas() {
        return this.sisi * this.sisi;
    }

    public float getKeliling() {
        return 4 * this.sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    public float getLuas() {
        return this.panjang * this.lebar;
    }

    public float getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}

class Lingkaran extends BangunDatar implements VarPHI {
    public float diameter;

    public float getLuas() {
        return decPhi * (float)Math.pow((0.5 * this.diameter), 2);
    }

    public float getKeliling() {
        return decPhi * diameter;
    }
}

public class Main {
    public static void main(String args[]) {
        BangunDatar objBangunDatar = new BangunDatar();
        Persegi objPersegi = new Persegi();
        PersegiPanjang objPersegiPanjang = new PersegiPanjang();
        Lingkaran objLingkaran = new Lingkaran();

        objPersegi.sisi = 8;
        objBangunDatar.getLuas("Persegi");
        System.out.println(objPersegi.getLuas());
        objBangunDatar.getKeliling("Persegi");
        System.out.println(objPersegi.getKeliling());

        objPersegiPanjang.panjang = 8;
        objPersegiPanjang.lebar = 9;
        objBangunDatar.getLuas("Persegi Panjang");
        System.out.println(objPersegiPanjang.getLuas());
        objBangunDatar.getKeliling("Persegi Panjang");
        System.out.println(objPersegiPanjang.getKeliling());

        objLingkaran.diameter = 14;
        objBangunDatar.getLuas("Lingkaran");
        System.out.println(objLingkaran.getLuas());
        objBangunDatar.getKeliling("Lingkaran");
        System.out.println(objLingkaran.getKeliling());
    }
}