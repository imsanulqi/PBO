package bangunruang;

public class Kubus implements BangunRuang {
    double sisi;
    double volume, luasPermukaan;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void calcVolume() {
        volume = Math.pow(sisi, 3);
    }

    @Override
    public void calcLuasPermukaan() {
        luasPermukaan = 6 * Math.pow(sisi, 2);
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}