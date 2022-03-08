package Maret_03;

public abstract class KelasAbstract {
    private String namaMenu;
    private int hargaMenu;

    abstract void pilihMakan(String menu, int hargaMenu);

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }
}
