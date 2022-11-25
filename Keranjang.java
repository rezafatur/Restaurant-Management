class Keranjang{
    private int banyak;
    private int harga;
    private String nama;
    private String tipe;
    
    Keranjang(int banyak, int harga, String nama, String tipe){
        this.banyak = banyak;
        this.harga = harga;
        this.nama = nama;
        this.tipe = tipe;
    }
    
    public int getBanyak(){
        return banyak;
    }
    public int getHarga(){
        return harga;
    }
    public String getNama(){
        return nama;
    }
    public String getTipe(){
        return tipe;
    }
    
    @Override
    public String toString(){
        return banyak + " " + harga + " " + nama + " " + tipe;
    }
}