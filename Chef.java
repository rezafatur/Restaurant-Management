class Chef{
    private String nama;
    private String jenKel;
    private String bagian;
    private String shift;
    
    Chef(String nama, String jenKel, String bagian, String shift){
        this.nama = nama;
        this.jenKel = jenKel;
        this.bagian = bagian;
        this.shift = shift;
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
    public String getShift(){
        return shift;
    }
    @Override
    public String toString(){
        return nama + " " + jenKel + " " + bagian + " " + shift;
    } 
}