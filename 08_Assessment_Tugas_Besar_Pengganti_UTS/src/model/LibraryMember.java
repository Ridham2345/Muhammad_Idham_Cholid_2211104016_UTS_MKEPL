import java.util.Date;

public class LibraryMember {
    private PersonalInfo personalInfo;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private MembershipStatus membershipStatus;
    private RiskProfile riskProfile;
    private String kodeReferal;
    private boolean langgananBuletin;

    public LibraryMember(PersonalInfo personalInfo, String kodeAnggota, Date tanggalGabung,
        boolean statusAktif, MembershipStatus membershipStatus, RiskProfile riskProfile,
        String kodeReferal, boolean langgananBuletin) {
        this.personalInfo = personalInfo;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.membershipStatus = membershipStatus;
        this.riskProfile = riskProfile;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        System.out.println("Nama         : " + personalInfo.getNamaLengkap());
        System.out.println("Jenis Kelamin: " + personalInfo.getJenisKelamin());
        System.out.println("Alamat       : " + personalInfo.getAlamat());
        System.out.println("Telepon      : " + personalInfo.getNomorTelepon());
        System.out.println("Email        : " + personalInfo.getEmail());
        System.out.println("Tingkat      : " + membershipStatus.getTingkatKeanggotaan());
        System.out.println("Poin         : " + membershipStatus.getPoinLoyalitas());
        System.out.println("Layak Upgrade?: " + membershipStatus.isEligibleForUpgrade());
        System.out.println("Skor Risiko  : " + riskProfile.hitungSkorRisiko());
        System.out.println("===========================");
    }
}
