public class MembershipInfo {
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;

    public MembershipInfo(String kodeAnggota, Date tanggalGabung, boolean statusAktif, String tingkatKeanggotaan,
                          int jumlahBukuDipinjam, int jumlahTerlambat, int jumlahDenda, int poinLoyalitas) {
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
    }

    // Getter dan logic untuk skor risiko dan kelayakan upgrade bisa dipindah ke sini
}
