// Factory Method: Membuat Sistem Irigasi Berdasarkan Jenis Tanaman
abstract class SistemIrigasi {
    public abstract String irigasi();
}

class IrigasiTetes extends SistemIrigasi {
    @Override
    public String irigasi() {
        return "Irigasi tetes aktif untuk tanaman buah";
    }
}

class IrigasiGenangan extends SistemIrigasi {
    @Override
    public String irigasi() {
        return "Irigasi genangan aktif untuk tanaman padi";
    }
}

class IrigasiFactory {
    public static SistemIrigasi buatIrigasi(String jenisTanaman) {
        switch (jenisTanaman.toLowerCase()) {
            case "buah":
                return new IrigasiTetes();
            case "padi":
                return new IrigasiGenangan();
            default:
                throw new IllegalArgumentException("Jenis tanaman tidak didukung");
        }
    }
}
