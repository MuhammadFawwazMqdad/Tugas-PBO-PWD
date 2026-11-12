package Tugas_Per8;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) { 
        this.panjang = panjang; 
    }
    public float getPanjang() { 
        return panjang; 
    }

    public void setLebar(float lebar) { 
        this.lebar = lebar; 
    }
    public float getLebar() { 
        return lebar; 
    }

    @Override
    protected float luas() { 
        return panjang * lebar; 
    }

    @Override
    protected float keliling() { 
        return 2 * (panjang + lebar); 
    }

    @Override
    public float getLuas() { 
        return luas(); 
    }

    @Override
    public float getKeliling() {
        float hasilKeliling = keliling();
        System.out.println("3. Persegi Panjang");
        System.out.println("Panjang  : " + this.panjang);
        System.out.println("Lebar    : " + this.lebar);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + hasilKeliling);
        System.out.println("----------------------------------");
        return hasilKeliling;
    }
}
