class Iced {
    private int harga_minuman_iced;
    private String nama_minuman_iced;
    
    Iced(int harga_minuman_iced, String nama_minuman_iced){
        this.harga_minuman_iced = harga_minuman_iced;
        this.nama_minuman_iced = nama_minuman_iced;
    }
    
    public int getHarga_minuman_iced(){
        return harga_minuman_iced;
    }
    public String getNama_minuman_iced(){
        return nama_minuman_iced;
    }
    @Override
    public String toString(){
        return harga_minuman_iced + " " + nama_minuman_iced;
    }
}