class Main_Course{
    private int harga_makanan_main_course;
    private String nama_makanan_main_course;
    
    Main_Course(int harga_makanan_main_course, String nama_makanan_main_course){
        this.harga_makanan_main_course = harga_makanan_main_course;
        this.nama_makanan_main_course = nama_makanan_main_course;
    }
    
    public int getHarga_makanan_main_course(){
        return harga_makanan_main_course;
    }
    public String getNama_makanan_main_course(){
        return nama_makanan_main_course;
    }
    @Override
    public String toString(){
        return harga_makanan_main_course + " " + nama_makanan_main_course;
    }
}