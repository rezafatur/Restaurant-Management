class Appetizer{
    private int harga_makanan_appetizer;
    private String nama_makanan_appetizer;
    
    Appetizer(int harga_makanan_appetizer, String nama_makanan_appetizer){
        this.harga_makanan_appetizer = harga_makanan_appetizer;
        this.nama_makanan_appetizer = nama_makanan_appetizer;
    }
    
    public int getHarga_makanan_appetizer(){
        return harga_makanan_appetizer;
    }
    public String getNama_makanan_appetizer(){
        return nama_makanan_appetizer;
    }
    @Override
    public String toString(){
        return harga_makanan_appetizer + " " + nama_makanan_appetizer;
    }    
}