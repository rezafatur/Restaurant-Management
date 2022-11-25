class Waiters{
    private String nama;
    private String jenKel;
    private String shift;
    
    Waiters(String nama, String jenKel, String shift){
        this.nama = nama;
        this.jenKel = jenKel;
        this.shift = shift;
    }
    
    public String getNama(){
        return nama;
    }
    public String getjenKel(){
        return jenKel;
    }
    public String getShift(){
        return shift;
    }
    @Override
    public String toString(){
        return nama + " " + jenKel + " " + shift;
    } 
}