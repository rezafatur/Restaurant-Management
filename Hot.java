class Hot{
    private int harga_minuman_hot;
    private String nama_minuman_hot;
    
    Hot(int harga_minuman_hot, String nama_minuman_hot){
        this.harga_minuman_hot = harga_minuman_hot;
        this.nama_minuman_hot = nama_minuman_hot;
    }
    
    public int getHarga_minuman_hot(){
        return harga_minuman_hot;
    }
    public String getNama_minuman_hot(){
        return nama_minuman_hot;
    }
    @Override
    public String toString(){
        return harga_minuman_hot + " " + nama_minuman_hot;
    }
}