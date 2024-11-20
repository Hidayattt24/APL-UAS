// Strategy Pattern: Menentukan Jadwal Irigasi
interface JadwalIrigasi {
    String tentukanJadwal();
}

class JadwalMusimHujan implements JadwalIrigasi {
    @Override
    public String tentukanJadwal() {
        return "Irigasi hanya dilakukan satu kali seminggu";
    }
}

class JadwalMusimKering implements JadwalIrigasi {
    @Override
    public String tentukanJadwal() {
        return "Irigasi dilakukan dua kali sehari";
    }
}

class SistemPenjadwalan {
    private JadwalIrigasi strategi;

    public void setStrategi(JadwalIrigasi strategi) {
        this.strategi = strategi;
    }

    public String aturJadwal() {
        return strategi.tentukanJadwal();
    }
}
