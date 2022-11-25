class Financial{
    private String nama;
    private String jenKel;
    private String bagian;
    
    Financial(String nama, String jenKel, String bagian){
        this.nama = nama;
        this.jenKel = jenKel;
        this.bagian = bagian;
    }
    
    public String getNama(){
        return nama;
    }
    public String getjenKel(){
        return jenKel;
    }
    public String getBagian(){
        return bagian;
    }
    @Override
    public String toString(){
        return nama + " " + jenKel + " " + bagian;
    } 
}