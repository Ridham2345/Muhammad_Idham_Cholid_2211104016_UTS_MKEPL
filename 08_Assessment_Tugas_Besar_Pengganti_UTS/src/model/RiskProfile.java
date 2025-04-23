public class RiskProfile {
    private int jumlahTerlambat;
    private int jumlahDenda;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;

    public RiskProfile(int jumlahTerlambat, int jumlahDenda, boolean statusAktif, String tingkatKeanggotaan, int jumlahBukuDipinjam) {
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
    }

    public double hitungSkorRisiko() {
        double skor = 0;
        skor += jumlahTerlambat * 1.5;
        skor += jumlahDenda * 0.1;
        if (!statusAktif) skor += 5;
        if (tingkatKeanggotaan.equals("DASAR")) skor += 2;
        if (jumlahBukuDipinjam > 50) skor -= 1.5;
        return skor;
    }
}
