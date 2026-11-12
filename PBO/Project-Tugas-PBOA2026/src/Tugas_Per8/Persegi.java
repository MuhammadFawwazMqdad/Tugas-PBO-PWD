package Tugas_Per8;

public class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) { 
        this.sisi = sisi; 
    }
    public float getSisi() { 
        return sisi; 
    }

    @Override
    protected float luas() { 
        return sisi * sisi; 
    }

    @Override
    protected float keliling() { 
        return 4 * sisi; 
    }

    @Override
    public float getLuas() { 
        return luas(); 
    }

    @Override
    public float getKeliling() {
        float hasilKeliling = keliling();
        System.out.println("1. Persegi");
        System.out.println("Sisi     : " + this.sisi);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + hasilKeliling);
        System.out.println("----------------------------------");
        return hasilKeliling;
    }
}
