class Karyawan{
    private double upah;
    private double TotalBayar;

    public Karyawan() {
        upah = 0;
        TotalBayar = 0;
    }

    public Karyawan(double upah) {
        this.upah = upah;
        this.TotalBayar = upah;

    }

    public Karyawan(double upah, int jumlah){
        this.upah = upah;
        this.TotalBayar = upah * (double)jumlah;

    }

    public Karyawan(double upah, double jumlah){
        this.upah = upah;
        this.TotalBayar = upah * jumlah;
    }

    public double getTotalBayar(){
        return TotalBayar;
    }
}

public class Main {
    public static void main (String[] args){
        Karyawan t1 = new Karyawan();
        Karyawan t2 = new Karyawan(50000);
        Karyawan t3 = new Karyawan(50000, 3);
        Karyawan t4 = new Karyawan(50000, 7);

        System.out.println("Perhitung Jam Lembur");
        System.out.println("Take home pay karyawan 1 : " + t1.getTotalBayar());
        System.out.println("Take home pay karyawan 2 : " + t2.getTotalBayar());
        System.out.println("Take home pay karyawan 3 : " + t3.getTotalBayar());
        System.out.println("Take home pay karyawan 4 : " + t4.getTotalBayar());
    }
}