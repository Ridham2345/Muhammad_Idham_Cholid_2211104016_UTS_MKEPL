public class MembershipStatus {
    private String tingkatKeanggotaan; // e.g. "DASAR", "PREMIUM", "VIP"
    private int poinLoyalitas;

    public MembershipStatus(String tingkatKeanggotaan, int poinLoyalitas) {
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.poinLoyalitas = poinLoyalitas;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }

    public int getPoinLoyalitas() {
        return poinLoyalitas;
    }

     * Periksa apakah eligible upgrade:
     * - Dari DASAR ke PREMIUM jika >100 poin
     * - Dari PREMIUM ke VIP jika >500 poin
     */
    public boolean isEligibleForUpgrade() {
        switch (tingkatKeanggotaan) {
            case "DASAR":
                return poinLoyalitas > 100;
            case "PREMIUM":
                return poinLoyalitas > 500;
            default:
                return false;
        }
    }
    public boolean upgrade() {
        if (!isEligibleForUpgrade()) {
            return false;
        }
        if (tingkatKeanggotaan.equals("DASAR")) {
            tingkatKeanggotaan = "PREMIUM";
        } else if (tingkatKeanggotaan.equals("PREMIUM")) {
            tingkatKeanggotaan = "VIP";
        }
        // reset atau adjust poin sesuai kebijakan
        poinLoyalitas = 0;
        return true;
    }
}
