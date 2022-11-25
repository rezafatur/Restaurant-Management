import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Database{
    Scanner input = new Scanner(System.in);
    Scanner input_string = new Scanner(System.in);
    List<Appetizer> app = new ArrayList<>();
    List<Main_Course> mc = new ArrayList<>();
    List<Dessert> ds = new ArrayList<>();
    List<Iced> ice = new ArrayList<>();
    List<Hot> hot = new ArrayList<>();
    List<Keranjang> ker = new ArrayList<>();
    List<Waiters> wtr = new ArrayList<>();
    List<Chef> chef = new ArrayList<>();
    List<Financial> fin = new ArrayList<>();
    int size_app = app.size();
    int size_mc = mc.size();
    int size_ds = ds.size();
    int size_ice = ice.size();
    int size_hot = hot.size();
    int size_ker = ker.size();
    int size_wtr = wtr.size();
    int size_chef = chef.size();
    int size_fin = fin.size();
    
    void tambahAppetizer(){
        System.out.print("Masukkan nama makanan : ");
        String nama_makanan = input_string.nextLine();
        System.out.print("Masukkan harga makanan: Rp. ");
        int harga_makanan = input.nextInt();
        
        app.add(new Appetizer(harga_makanan, nama_makanan));
    }
    
    void tambahMainCourse(){
        System.out.print("Masukkan nama makanan : ");
        String nama_makanan = input_string.nextLine();
        System.out.print("Masukkan harga makanan: Rp. ");
        int harga_makanan = input.nextInt();
        
        mc.add(new Main_Course(harga_makanan, nama_makanan));
    }
    
    
    void tambahDessert(){
        System.out.print("Masukkan nama makanan : ");
        String nama_makanan = input_string.nextLine();
        System.out.print("Masukkan harga makanan: Rp. ");
        int harga_makanan = input.nextInt();
        
        ds.add(new Dessert(harga_makanan, nama_makanan));
    }
    
    void tambahMinumanIced(){
        System.out.print("Masukkan nama minuman : ");
        String nama_minuman = input_string.nextLine();
        System.out.print("Masukkan harga minuman: Rp. ");
        int harga_minuman = input.nextInt();
        
        ice.add(new Iced(harga_minuman, nama_minuman));
    }
    
    void tambahMinumanHot(){
        System.out.print("Masukkan nama minuman : ");
        String nama_minuman = input_string.nextLine();
        System.out.print("Masukkan harga minuman: Rp. ");
        int harga_minuman = input.nextInt();
        
        hot.add(new Hot(harga_minuman, nama_minuman));
    }
    
    void editAppetizer(){
        size_app = app.size();
        if(size_app != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_app && pilihan > 0){
                System.out.print("\nMasukkan nama makanan : ");
                String nama_makanan = input_string.nextLine();
                System.out.print("Masukkan harga makanan: Rp. ");
                int harga_makanan = input.nextInt();
                
                app.set(pilihan - 1, new Appetizer(harga_makanan, nama_makanan));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void editMainCourse(){
        size_mc = mc.size();
        if(size_mc != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_mc && pilihan > 0){
                System.out.print("\nMasukkan nama makanan : ");
                String nama_makanan = input_string.nextLine();
                System.out.print("Masukkan harga makanan: Rp. ");
                int harga_makanan = input.nextInt();
                
                mc.set(pilihan - 1, new Main_Course(harga_makanan, nama_makanan));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void editDessert(){
        size_ds = ds.size();
        if(size_ds != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_ds && pilihan > 0){
                System.out.print("\nMasukkan nama makanan : ");
                String nama_makanan = input_string.nextLine();
                System.out.print("Masukkan harga makanan: Rp. ");
                int harga_makanan = input.nextInt();
                
                ds.set(pilihan - 1, new Dessert(harga_makanan, nama_makanan));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void editIced(){
        size_ice = ice.size();
        if(size_ice != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_ice && pilihan > 0){
                System.out.print("\nMasukkan nama minuman : ");
                String nama_minuman = input_string.nextLine();
                System.out.print("Masukkan harga minuman: Rp. ");
                int harga_minuman = input.nextInt();
                
                ice.set(pilihan - 1, new Iced(harga_minuman, nama_minuman));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void editHot(){
        size_hot = hot.size();
        if(size_hot != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_hot && pilihan > 0){
                System.out.print("\nMasukkan nama minuman : ");
                String nama_minuman = input_string.nextLine();
                System.out.print("Masukkan harga minuman: Rp. ");
                int harga_minuman = input.nextInt();
                
                hot.set(pilihan - 1, new Hot(harga_minuman, nama_minuman));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void hapusAppertizer(){
        size_app = app.size();
        if(size_app != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_app && pilihan > 0){
                app.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void hapusMainCourse(){
        size_mc = mc.size();
        if(size_mc != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_mc && pilihan > 0){
                mc.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void hapusDessert(){
        size_ds = ds.size();
        if(size_ds != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_ds && pilihan > 0){
                ds.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void hapusIced(){
        size_ice = ice.size();
        if(size_ice != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_ice && pilihan > 0){
                ice.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void hapusHot(){
        size_hot = hot.size();
        if(size_hot != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_hot && pilihan > 0){
                hot.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=======================================================");
        }
    }
    
    void displayListAppetizer(){
        size_app = app.size();
        System.out.println("============= Hidangan Pembuka (Appetizer) ============");
        if(size_app == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t|\n");
            System.out.println("=======================================================");
        }
        else{
            System.out.println("| NO | Nama Makanan\t\t\t| Harga \t|");
            for(int i = 0; i < size_app; i++){
                if(app.get(i).getNama_makanan_appetizer().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + app.get(i).getNama_makanan_appetizer() + "\t\t| Rp. " + app.get(i).getHarga_makanan_appetizer() + " \t|");
                }
                else if(app.get(i).getNama_makanan_appetizer().length() < 8){
                    System.out.println("| " + (i+1) + ". | " + app.get(i).getNama_makanan_appetizer() + "\t\t\t\t| Rp. " + app.get(i).getHarga_makanan_appetizer() + " \t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + app.get(i).getNama_makanan_appetizer() + "\t\t\t| Rp. " + app.get(i).getHarga_makanan_appetizer() + " \t|");
                }
            }
            System.out.println("=======================================================");
        }
    }
    
    void displayListMainCourse(){
        size_mc = mc.size();
        System.out.println("============= Hidangan Utama (Main Course) ============");
        if(size_mc == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t|\n");
            System.out.println("=======================================================");
        }
        else{
            System.out.println("| NO | Nama Makanan\t\t\t| Harga \t|");
            for(int i = 0; i < size_mc; i++){
                if(mc.get(i).getNama_makanan_main_course().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + mc.get(i).getNama_makanan_main_course() + "\t\t| Rp. " + mc.get(i).getHarga_makanan_main_course() + " \t|");
                }
                else if(mc.get(i).getNama_makanan_main_course().length() < 8){
                    System.out.println("| " + (i+1) + ". | " + mc.get(i).getNama_makanan_main_course() + "\t\t\t\t| Rp. " + mc.get(i).getHarga_makanan_main_course() + " \t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + mc.get(i).getNama_makanan_main_course() + "\t\t\t| Rp. " + mc.get(i).getHarga_makanan_main_course() + " \t|");
                }
            }
            System.out.println("=======================================================");
        }
    }
    
    void displayListDessert(){
        size_ds = ds.size();
        System.out.println("============== Hidangan Penutup (Dessert) =============");
        if(size_ds == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t|\n");
            System.out.println("=======================================================");
        }
        else{
            System.out.println("| NO | Nama Makanan\t\t\t| Harga \t|");
            for(int i = 0; i < size_ds; i++){
                if(ds.get(i).getNama_makanan_dessert().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + ds.get(i).getNama_makanan_dessert() + "\t\t| Rp. " + ds.get(i).getHarga_makanan_dessert() + " \t|");
                }
                else if(ds.get(i).getNama_makanan_dessert().length() < 8){
                    System.out.println("| " + (i+1) + ". | " + ds.get(i).getNama_makanan_dessert() + "\t\t\t\t| Rp. " + ds.get(i).getHarga_makanan_dessert() + " \t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + ds.get(i).getNama_makanan_dessert() + "\t\t\t| Rp. " + ds.get(i).getHarga_makanan_dessert() + " \t|");
                }
            }
            System.out.println("=======================================================");
        }
    }
    
    void displayListIced(){
        size_ice = ice.size();
        System.out.println("==================== Dingin (Iced) ====================");
        if(size_ice == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t|\n");
            System.out.println("=======================================================");
        }
        else{
            System.out.println("| NO | Nama Minuman\t\t\t| Harga \t|");
            for(int i = 0; i < size_ice; i++){
                if(ice.get(i).getNama_minuman_iced().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + ice.get(i).getNama_minuman_iced() + "\t\t| Rp. " + ice.get(i).getHarga_minuman_iced() + " \t|");
                }
                else if(ice.get(i).getNama_minuman_iced().length() < 8){
                    System.out.println("| " + (i+1) + ". | " + ice.get(i).getNama_minuman_iced() + "\t\t\t\t| Rp. " + ice.get(i).getHarga_minuman_iced() + " \t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + ice.get(i).getNama_minuman_iced() + "\t\t\t| Rp. " + ice.get(i).getHarga_minuman_iced() + " \t|");
                }
            }
            System.out.println("=======================================================");
        }
    }
    
    void displayListHot(){
        size_hot = hot.size();
        System.out.println("===================== Panas (Hot) =====================");
        if(size_hot == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t|\n");
            System.out.println("=======================================================");
        }
        else{
            System.out.println("| NO | Nama Minuman\t\t\t| Harga \t|");
            for(int i = 0; i < size_hot; i++){
                if(hot.get(i).getNama_minuman_hot().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + hot.get(i).getNama_minuman_hot() + "\t\t| Rp. " + hot.get(i).getHarga_minuman_hot() + " \t|");
                }
                else if(hot.get(i).getNama_minuman_hot().length() < 8){
                    System.out.println("| " + (i+1) + ". | " + hot.get(i).getNama_minuman_hot() + "\t\t\t\t| Rp. " + hot.get(i).getHarga_minuman_hot() + " \t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + hot.get(i).getNama_minuman_hot() + "\t\t\t| Rp. " + hot.get(i).getHarga_minuman_hot() + " \t|");
                }
            }
            System.out.println("=======================================================");
        }
    }
    
    void keranjangAppetizer(){
        size_app = app.size();
        if(size_app != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            System.out.print("Masukkan banyak pesanan: ");
            int banyak = input.nextInt();

            ker.add(new Keranjang(banyak, app.get(pilihan - 1).getHarga_makanan_appetizer(), app.get(pilihan - 1).getNama_makanan_appetizer(), "Appetizer"));
            System.out.println("=======================================================");
        }
    }
    
    void keranjangMainCourse(){
        size_mc = mc.size();
        if(size_mc != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            System.out.print("Masukkan banyak pesanan: ");
            int banyak = input.nextInt();

            ker.add(new Keranjang(banyak, mc.get(pilihan - 1).getHarga_makanan_main_course(), mc.get(pilihan - 1).getNama_makanan_main_course(), "Main Course"));
            System.out.println("=======================================================");
        }
    }
    
    void keranjangDessert(){
        size_ds = ds.size();
        if(size_ds != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            System.out.print("Masukkan banyak pesanan: ");
            int banyak = input.nextInt();

            ker.add(new Keranjang(banyak, ds.get(pilihan - 1).getHarga_makanan_dessert(), ds.get(pilihan - 1).getNama_makanan_dessert(), "Dessert"));
            System.out.println("=======================================================");
        }
    }
    
    void keranjangIced(){
        size_ice = ice.size();
        if(size_ice != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            System.out.print("Masukkan banyak pesanan: ");
            int banyak = input.nextInt();

            ker.add(new Keranjang(banyak, ice.get(pilihan - 1).getHarga_minuman_iced(), ice.get(pilihan - 1).getNama_minuman_iced(), "Iced"));
            System.out.println("=======================================================");
        }
    }
    
    void keranjangHot(){
        size_hot = hot.size();
        if(size_hot != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            System.out.print("Masukkan banyak pesanan: ");
            int banyak = input.nextInt();

            ker.add(new Keranjang(banyak, hot.get(pilihan - 1).getHarga_minuman_hot(), hot.get(pilihan - 1).getNama_minuman_hot(), "Hot"));
            System.out.println("=======================================================");
        }
    }
    
    void displayKeranjang(){
        abstract class pembayaran{
            final float pajak = 0.1f;
            abstract float getTotal();
        }
        
        class perhitungan extends pembayaran{
            float total;
            
            public perhitungan(float total){
                this.total = total;
            }
            
            @Override
            float getTotal(){
                float total_keseluruhan = total + (total * pajak);
                return total_keseluruhan;
            }
        }
        
        size_ker = ker.size();
        System.out.println("========================================== Keranjang ========================================");
        if(size_ker == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t\t\t\t\t\t|\n");
        }
        else{
            float total = 0;
            System.out.println("| NO | Nama Makanan & Minuman \t\t| Tipe\t\t\t| Pesanan \t| Harga\t\t|");;
            for(int i = 0; i < size_ker; i++){
                if(ker.get(i).getNama().length() > 15){
                    System.out.println("| " + (i+1) + ". | " + ker.get(i).getNama() + "\t\t| " + ker.get(i).getTipe() + "\t\t| " + 
                        ker.get(i).getBanyak() + "\t\t| " + "Rp. " + (ker.get(i).getHarga()*ker.get(i).getBanyak()) + "\t|");
                }
                else if(ker.get(i).getNama().length() < 8){
                    if("Iced".equals(ker.get(i).getTipe()) || "Hot".equals(ker.get(i).getTipe())){
                        System.out.println("| " + (i+1) + ". | " + ker.get(i).getNama() + "\t\t\t\t| " + ker.get(i).getTipe() + "\t\t\t| " + 
                        ker.get(i).getBanyak() + "\t\t| " + "Rp. " + (ker.get(i).getHarga()*ker.get(i).getBanyak()) + "\t|");
                    }
                    else{
                        System.out.println("| " + (i+1) + ". | " + ker.get(i).getNama() + "\t\t\t\t| " + ker.get(i).getTipe() + "\t\t| " + 
                        ker.get(i).getBanyak() + "\t\t| " + "Rp. " + (ker.get(i).getHarga()*ker.get(i).getBanyak()) + "\t|");
                    }
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + ker.get(i).getNama() + "\t\t\t| " + ker.get(i).getTipe() + "\t\t\t| " + 
                        ker.get(i).getBanyak() + "\t\t| " + "Rp. " + (ker.get(i).getHarga()*ker.get(i).getBanyak()) + "\t|");
                }
                total += (ker.get(i).getHarga() * ker.get(i).getBanyak());
            }
            System.out.println("=============================================================================================");
            perhitungan hitung = new perhitungan(total);
            System.out.println("TOTAL + Pajak 10% = Rp. " + String.format("%.0f", hitung.getTotal()));
            
            System.out.print("Apakah Anda ingin melakukan pembayaran? [Y/N] ");
            String bayar = input_string.nextLine();
            if("Y".equals(bayar) || "y".equals(bayar)){
                ker.removeAll(ker);
                System.out.println("\nPembayaran Berhasil");
            }
        }
    }
    
    void tambahWaiters(){
        System.out.print("Masukkan nama         : ");
        String nama = input_string.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jenKel = input_string.nextLine();
        System.out.print("Masukkan jam bertugas : ");
        String shift = input_string.nextLine();
        
        wtr.add(new Waiters(nama, jenKel, shift));
    }
    
    void tambahChef(){
        System.out.print("Masukkan nama         : ");
        String nama = input_string.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jenKel = input_string.nextLine();
        System.out.print("Masukkan bagian tugas : ");
        String bagian = input_string.nextLine();
        System.out.print("Masukkan jam bertugas : ");
        String shift = input_string.nextLine();
        
        chef.add(new Chef(nama, jenKel, bagian, shift));
    }
    
    void tambahFinancial(){
        System.out.print("Masukkan nama         : ");
        String nama = input_string.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jenKel = input_string.nextLine();
        System.out.print("Masukkan bagian tugas : ");
        String bagian = input_string.nextLine();
        
        fin.add(new Financial(nama, jenKel, bagian));
    }
    
    void editWaiters(){
        size_wtr = wtr.size();
        if(size_wtr != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_wtr && pilihan > 0){
                System.out.print("\nMasukkan nama         : ");
                String nama = input_string.nextLine();
                System.out.print("Masukkan jenis kelamin: ");
                String jenKel = input_string.nextLine();
                System.out.print("Masukkan jam bertugas : ");
                String shift = input_string.nextLine();
                
                wtr.set(pilihan - 1, new Waiters(nama, jenKel, shift));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("======================================================================");
        }
    }
    
    void editChef(){
        size_chef = chef.size();
        if(size_chef != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_chef && pilihan > 0){
                System.out.print("\nMasukkan nama         : ");
                String nama = input_string.nextLine();
                System.out.print("Masukkan jenis kelamin: ");
                String jenKel = input_string.nextLine();
                System.out.print("Masukkan bagian tugas : ");
                String bagian = input_string.nextLine();
                System.out.print("Masukkan jam bertugas : ");
                String shift = input_string.nextLine();

                chef.set(pilihan - 1, new Chef(nama, jenKel, bagian, shift));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=====================================================================================");
        }
    }
    
    void editFinancial(){
        size_fin = fin.size();
        if(size_fin != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_fin && pilihan > 0){
                System.out.print("\nMasukkan nama         : ");
                String nama = input_string.nextLine();
                System.out.print("Masukkan jenis kelamin: ");
                String jenKel = input_string.nextLine();
                System.out.print("Masukkan bagian tugas : ");
                String bagian = input_string.nextLine();
                
                fin.set(pilihan - 1, new Financial(nama, jenKel, bagian));
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("==============================================================================");
        }
    }
    
    void hapusWaiters(){
        size_wtr = wtr.size();
        if(size_wtr != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_wtr && pilihan > 0){
                wtr.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("======================================================================");
        }
    }
    
    void hapusChef(){
        size_chef = chef.size();
        if(size_chef != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_chef && pilihan > 0){
                chef.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("=====================================================================================");
        }
    }
    
    void hapusFinancial(){
        size_fin = fin.size();
        if(size_fin != 0){
            System.out.print("Masukkan pilihan Anda  : ");
            int pilihan = input.nextInt();
            
            if(pilihan <= size_fin && pilihan > 0){
                fin.remove(pilihan - 1);
                System.out.println("\nData berhasil dihapus");
            }
            else{
                System.out.println("\nPilihan menu tidak tersedia :(");
            }
            System.out.println("==============================================================================");
        }
    }
    
    void displayWaiters(){
        size_wtr = wtr.size();
        System.out.println("=============================== Waiters ==============================");
        if(size_wtr == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t\t\t|\n");
            System.out.println("======================================================================");
        }
        else{
            System.out.println("| NO | Nama \t\t\t| Jenis Kelamin \t| Jam Tugas \t|");
            for(int i = 0; i < size_wtr; i++){
                System.out.println("| " + (i+1) + ". | " + wtr.get(i).getNama() + "\t\t\t| " + wtr.get(i).getjenKel() + "\t\t| " + wtr.get(i).getShift() + "\t|");
            }
            System.out.println("======================================================================");
        }
    }
    
    void displayChef(){
        size_chef = chef.size();
        System.out.println("======================================== Chef =======================================");
        if(size_chef == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t\t\t\t\t|\n");
            System.out.println("=====================================================================================");
        }
        else{
            System.out.println("| NO | Nama \t\t\t| Jenis Kelamin \t| Bagian \t| Jam Tugas \t|");
            for(int i = 0; i < size_chef; i++){
                if("Iced".equals(chef.get(i).getBagian()) || "Hot".equals(chef.get(i).getBagian())){
                    System.out.println("| " + (i+1) + ". | " + chef.get(i).getNama() + "\t\t\t| " + chef.get(i).getjenKel() + "\t\t| " + 
                            chef.get(i).getBagian() + "\t\t| " +  chef.get(i).getShift() + "\t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + chef.get(i).getNama() + "\t\t\t| " + chef.get(i).getjenKel() + "\t\t| " + 
                            chef.get(i).getBagian() + "\t| " +  chef.get(i).getShift() + "\t|");
                }
            }
            System.out.println("=====================================================================================");
        }
    }
    
    void displayFinancial(){
        size_fin = fin.size();
        System.out.println("=============================== Financial Dept. ==============================");
        if(size_fin == 0){
            System.out.print("| EMPTY \t\t\t\t\t\t\t\t\t|\n");
            System.out.println("==============================================================================");
        }
        else{
            System.out.println("| NO | Nama \t\t\t| Jenis Kelamin \t| Bagian \t\t|");
            for(int i = 0; i < size_fin; i++){
                if("Staf Keuangan & Audit".equals(fin.get(i).getBagian()) || "Konsultan Keuangan".equals(fin.get(i).getBagian())){
                    System.out.println("| " + (i+1) + ". | " + fin.get(i).getNama() + "\t\t\t| " + fin.get(i).getjenKel() + "\t\t| " + fin.get(i).getBagian() + "\t|");
                }
                else{
                    System.out.println("| " + (i+1) + ". | " + fin.get(i).getNama() + "\t\t\t| " + fin.get(i).getjenKel() + "\t\t| " + fin.get(i).getBagian() + "\t\t|");
                }
            }
            System.out.println("==============================================================================");
        }
    }
}