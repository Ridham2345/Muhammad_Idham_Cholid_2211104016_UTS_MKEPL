import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Membuat objek PersonalInfo
        PersonalInfo personalInfo = new PersonalInfo(
            "John Doe", 
            "Jl. Merdeka No.1, Jakarta", 
            "08123456789", 
            "john.doe@example.com", 
            "Laki-laki"
        );
        
        // Membuat objek MembershipStatus
        MembershipStatus membershipStatus = new MembershipStatus("DASAR", 120);
        
        // Membuat objek RiskProfile
        RiskProfile riskProfile = new RiskProfile(3, 50, true, "DASAR", 60);
        
        // Menginisialisasi tanggalGabung sebagai tanggal sekarang
        Date tanggalGabung = new Date(); 
        
        // Membuat objek LibraryMember
        LibraryMember libraryMember = new LibraryMember(
            personalInfo, 
            "A12345", 
            tanggalGabung, 
            true, 
            membershipStatus, 
            riskProfile, 
            "REF123", 
            true
        );
        
        // Menampilkan profil lengkap anggota
        libraryMember.cetakProfilLengkap();
        
        // Simulasi upgrade keanggotaan jika memenuhi syarat
        if (membershipStatus.isEligibleForUpgrade()) {
            System.out.println("\nAnggota memenuhi syarat untuk upgrade.");
            boolean berhasilUpgrade = membershipStatus.upgrade();
            if (berhasilUpgrade) {
                System.out.println("Upgrade berhasil! Tingkat keanggotaan sekarang: " + membershipStatus.getTingkatKeanggotaan());
            }
        } else {
            System.out.println("\nAnggota tidak memenuhi syarat untuk upgrade.");
        }
        
        // Menampilkan skor risiko setelah upgrade
        System.out.println("\nSkor Risiko Anggota: " + riskProfile.hitungSkorRisiko());
    }
}
