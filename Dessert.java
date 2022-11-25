class Dessert{
    private int harga_makanan_dessert;
    private String nama_makanan_dessert;
    
    Dessert(int harga_makanan_dessert, String nama_makanan_dessert){
        this.harga_makanan_dessert = harga_makanan_dessert;
        this.nama_makanan_dessert = nama_makanan_dessert;
    }
    
    public int getHarga_makanan_dessert(){
        return harga_makanan_dessert;
    }
    public String getNama_makanan_dessert(){
        return nama_makanan_dessert;
    }
    @Override
    public String toString(){
        return harga_makanan_dessert + " " + nama_makanan_dessert;
    }
}