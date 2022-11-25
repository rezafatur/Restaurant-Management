import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input_string = new Scanner(System.in);
        Customer cust = new Customer();
        Management manage = new Management();
        Database db = new Database();
        int pilihan;
        int pilihan_customer;
        int pilihan_management;
        
        do{
            System.out.println("=========================");
            System.out.println("| RESTAURANT MANAGEMENT |");
            System.out.println("=========================\n");
            System.out.println("========= LOGIN =========");
            System.out.println("| 1. Customer           |");
            System.out.println("| 2. Management         |");
            System.out.println("| 3. Keluar Program     |");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = input.nextInt();
            
            System.out.print("\n");
            switch(pilihan){
                case 1: // Customer
                    System.out.println("===== CUSTOMER LOGIN ====");
                    System.out.print("Username: ");
                    String username = input_string.nextLine();
                    System.out.print("Password: ");
                    String password = input_string.nextLine();
                    
                    Login log = new Login("cust123", "123");
                    if(username.equals(log.getUsername()) && password.equals(log.getPassword())){
                        System.out.println("\nBerhasil Login");
                        System.out.println("=========================\n");
                        
                        do{
                            cust.customerMenu();
                            System.out.print("Masukkan Pilihan Anda: ");
                            pilihan_customer = input.nextInt();

                            System.out.print("\n");
                            switch(pilihan_customer){
                                case 1: // Menu Beli
                                    int pilihan_beli;
                                    do{
                                        cust.customerMenuBeli();
                                        System.out.print("Masukkan Pilihan Anda: ");
                                        pilihan_beli = input.nextInt();
                                        
                                        System.out.print("\n");
                                        switch(pilihan_beli){
                                            case 1: // Makanan
                                                int pilihan_menu_makanan;
                                                do{
                                                    cust.customerMenuMakanan();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_menu_makanan = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_menu_makanan){
                                                        case 1: // Appetizer
                                                            db.displayListAppetizer();
                                                            db.keranjangAppetizer();
                                                            break;
                                                        case 2: // Main Course
                                                            db.displayListMainCourse();
                                                            db.keranjangMainCourse();
                                                            break;
                                                        case 3: // Dessert
                                                            db.displayListDessert();
                                                            db.keranjangDessert();
                                                            break;
                                                        case 4: // Kembali
                                                            System.out.println("Kembali ke Menu Beli");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_menu_makanan != 4);
                                                break;
                                            case 2: // Minuman
                                                int pilihan_menu_minuman;
                                                do{
                                                    cust.customerMenuMinuman();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_menu_minuman = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_menu_minuman){
                                                        case 1: // Iced
                                                            db.displayListIced();
                                                            db.keranjangIced();
                                                            break;
                                                        case 2: // Hot
                                                            db.displayListHot();
                                                            db.keranjangHot();
                                                            break;
                                                        case 3: // Kembali
                                                            System.out.println("Kembali ke Menu Beli");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_menu_minuman != 3);
                                                break;
                                            case 3: // Kembali
                                                System.out.println("Kembali ke Customer Menu");
                                                break;
                                            default:
                                                System.out.println("Pilihan menu tidak tersedia :(");
                                        }
                                    }while(pilihan_beli != 3);
                                    break;
                                case 2: // Keranjang
                                    db.displayKeranjang();
                                    System.out.println("=============================================================================================");
                                    break;
                                case 3: // Logout
                                    System.out.print("Berhasil Logout");
                                    break;
                                default:
                                    System.out.println("Pilihan menu tidak tersedia :(");
                            }
                            System.out.print("\n");
                        }while(pilihan_customer != 3);
                    }
                    else{
                        System.out.println("\nLogin gagal");
                    }
                    System.out.println("=========================");
                    break;
                case 2: // Management
                    System.out.println("==== MANAGEMENT LOGIN ===");
                    System.out.print("Username: ");
                    username = input_string.nextLine();
                    System.out.print("Password: ");
                    password = input_string.nextLine();
                    
                    log = new Login("manage123", "123");
                    if(username.equals(log.getUsername()) && password.equals(log.getPassword())){
                        System.out.println("\nBerhasil Login");
                        System.out.println("=========================\n");

                        do{
                            manage.managementMenu();
                            System.out.print("Masukkan Pilihan Anda: ");
                            pilihan_management = input.nextInt();

                            System.out.print("\n");
                            switch(pilihan_management){
                                case 1: // Makanan
                                    int pilihan_makanan;
                                    do{
                                        manage.managementMenuMakanan();
                                        System.out.print("Masukkan Pilihan Anda: ");
                                        pilihan_makanan = input.nextInt();
                                        
                                        System.out.print("\n");
                                        switch(pilihan_makanan){
                                            case 1: // Tambah Makanan
                                                int pilihan_tambah_makanan;
                                                do{
                                                    manage.managementMenuTambahMakanan();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_tambah_makanan = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_tambah_makanan){
                                                        case 1: // Appetizer
                                                            db.displayListAppetizer();
                                                            db.tambahAppetizer();
                                                            System.out.println("=======================================================\n");
                                                            break;
                                                        case 2: // Main Course
                                                            db.displayListMainCourse();
                                                            db.tambahMainCourse();
                                                            System.out.println("=======================================================\n");
                                                            break;
                                                        case 3: // Dessert
                                                            db.displayListDessert();
                                                            db.tambahDessert();
                                                            System.out.println("=======================================================\n");
                                                            break;
                                                        case 4: // Kembali
                                                            System.out.println("Kembali ke Menu Makanan\n");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                }while(pilihan_tambah_makanan != 4);
                                                break;
                                            case 2: // Edit Makanan
                                                int pilihan_edit_makanan;
                                                do{
                                                    manage.managementMenuEditMakanan();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_edit_makanan = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_edit_makanan){
                                                        case 1: // Appetizer
                                                            db.displayListAppetizer();
                                                            db.editAppetizer();
                                                            break;
                                                        case 2: // Main Course
                                                            db.displayListMainCourse();
                                                            db.editMainCourse();
                                                            break;
                                                        case 3: // Dessert
                                                            db.displayListDessert();
                                                            db.editDessert();
                                                            break;
                                                        case 4: // Kembali
                                                            System.out.println("Kembali ke Menu Makanan");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_edit_makanan != 4);
                                                break;
                                            case 3: // Hapus Makanan
                                                int pilihan_hapus_makanan;
                                                do{
                                                    manage.managementMenuHapusMakanan();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_hapus_makanan = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_hapus_makanan){
                                                        case 1: // Appetizer
                                                            db.displayListAppetizer();
                                                            db.hapusAppertizer();
                                                            break;
                                                        case 2: // Main Course
                                                            db.displayListMainCourse();
                                                            db.hapusMainCourse();
                                                            break;
                                                        case 3: // Dessert
                                                            db.displayListDessert();
                                                            db.hapusDessert();
                                                            break;
                                                        case 4: // Kembali
                                                            System.out.println("Kembali ke Menu Makanan");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_hapus_makanan != 4);
                                                break;
                                            case 4: // Kembali
                                                System.out.println("Kembali ke Management Menu");
                                                break;
                                            default:
                                                System.out.println("Pilihan menu tidak tersedia :(\n");
                                        }                    
                                    }while (pilihan_makanan != 4);
                                    break;
                                case 2: // Minuman
                                    int pilihan_minuman;
                                    do{
                                        manage.managementMenuMinuman();
                                        System.out.print("Masukkan Pilihan Anda: ");
                                        pilihan_minuman = input.nextInt();
                                        
                                        System.out.print("\n");
                                        switch(pilihan_minuman){
                                            case 1: // Tambah Minuman
                                                int pilihan_tambah_minuman;
                                                do{
                                                    manage.managementMenuTambahMinuman();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_tambah_minuman = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_tambah_minuman){
                                                        case 1: // Iced
                                                            db.displayListIced();
                                                            db.tambahMinumanIced();
                                                            System.out.println("=======================================================\n");
                                                            break;
                                                        case 2: // Hot
                                                            db.displayListHot();
                                                            db.tambahMinumanHot();
                                                            System.out.println("=======================================================\n");
                                                            break;
                                                        case 3: // Kembali
                                                            System.out.println("Kembali ke Menu Minuman");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                }while(pilihan_tambah_minuman != 3);
                                                break;
                                            case 2: // Edit Minuman
                                                int pilihan_edit_minuman;
                                                do{
                                                    manage.managementMenuEditMinuman();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_edit_minuman = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_edit_minuman){
                                                        case 1: // Iced
                                                            db.displayListIced();
                                                            db.editIced();
                                                            break;
                                                        case 2: // Hot
                                                            db.displayListHot();
                                                            db.editHot();
                                                            break;
                                                        case 3: // Kembali
                                                            System.out.println("Kembali ke Menu Minuman");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_edit_minuman != 3);
                                                break;
                                            case 3: // Hapus Minuman
                                                int pilihan_hapus_minuman;
                                                do{
                                                    manage.managementMenuHapusMinuman();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_hapus_minuman = input.nextInt();
                                                    
                                                    System.out.print("\n");
                                                    switch(pilihan_hapus_minuman){
                                                        case 1: // Iced
                                                            db.displayListIced();
                                                            db.hapusIced();
                                                            break;
                                                        case 2: // Hot
                                                            db.displayListHot();
                                                            db.hapusHot();
                                                            break;
                                                        case 3: // Kembali
                                                            System.out.println("Kembali ke Menu Minuman");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan menu tidak tersedia :(");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_hapus_minuman != 3);
                                                break;
                                            case 4: // Kembali
                                                System.out.print("Kembali ke Management Menu");
                                                break;
                                            default:
                                                System.out.println("Pilihan menu tidak tersedia :(");
                                        }
                                        System.out.print("\n");
                                    }while(pilihan_minuman != 4);
                                    break;
                                case 3: // Divisi
                                    int pilihan_divisi;
                                    do{
                                        manage.managementMenuDivisi();
                                        System.out.print("Masukkan Pilihan Anda: ");
                                        pilihan_divisi = input.nextInt();
                                        
                                        System.out.print("\n");
                                        switch(pilihan_divisi){
                                            case 1: // Waiters
                                                int pilihan_waiters;
                                                do{
                                                    manage.managementMenuWaiters();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_waiters = input.nextInt();

                                                    System.out.print("\n");
                                                    switch(pilihan_waiters){
                                                        case 1: // Tambah
                                                            db.displayWaiters();
                                                            db.tambahWaiters();
                                                            System.out.println("======================================================================");
                                                            break;
                                                        case 2: // Edit
                                                            db.displayWaiters();
                                                            db.editWaiters();
                                                            break;
                                                        case 3: // Hapus
                                                            db.displayWaiters();
                                                            db.hapusWaiters();
                                                            break;
                                                        case 4: // Tampilkan
                                                            db.displayWaiters();
                                                            break;
                                                        case 5: // Kembali
                                                            System.out.print("Kembali ke Menu Divisi");
                                                            break;
                                                        default:
                                                            System.out.print("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_waiters != 5);
                                                break;
                                            case 2: // Chef
                                                int pilihan_chef;
                                                do{
                                                    manage.managementMenuChef();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_chef = input.nextInt();

                                                    System.out.print("\n");
                                                    switch(pilihan_chef){
                                                        case 1: // Tambah
                                                            db.displayChef();
                                                            db.tambahChef();
                                                            System.out.println("=====================================================================================");
                                                            break;
                                                        case 2: // Edit
                                                            db.displayChef();
                                                            db.editChef();
                                                            break;
                                                        case 3: // Hapus
                                                            db.displayChef();
                                                            db.hapusChef();
                                                            break;
                                                        case 4: // Tampilkan
                                                            db.displayChef();
                                                            break;
                                                        case 5: // Kembali
                                                            System.out.print("Kembali ke Menu Divisi");
                                                            break;
                                                        default:
                                                            System.out.print("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_chef!= 5);
                                                break;
                                            case 3: // Financial Dept.
                                                int pilihan_financial;
                                                do{
                                                    manage.managementMenuFinancial();
                                                    System.out.print("Masukkan Pilihan Anda: ");
                                                    pilihan_financial = input.nextInt();

                                                    System.out.print("\n");
                                                    switch(pilihan_financial){
                                                        case 1: // Tambah
                                                            db.displayFinancial();
                                                            db.tambahFinancial();
                                                            System.out.println("==============================================================================");
                                                            break;
                                                        case 2: // Edit
                                                            db.displayFinancial();
                                                            db.editFinancial();
                                                            break;
                                                        case 3: // Hapus
                                                            db.displayFinancial();
                                                            db.hapusFinancial();
                                                            break;
                                                        case 4: // Tampilkan
                                                            db.displayFinancial();
                                                            break;
                                                        case 5: // Kembali
                                                            System.out.print("Kembali ke Menu Divisi");
                                                            break;
                                                        default:
                                                            System.out.print("Pilihan menu tidak tersedia :(\n");
                                                    }
                                                    System.out.print("\n");
                                                }while(pilihan_financial != 5);
                                                break;
                                            case 4:
                                                System.out.print("Kembali ke Management Menu");
                                                break;
                                            default:
                                                System.out.println("Pilihan menu tidak tersedia :(");
                                        }
                                        System.out.print("\n");
                                    }while(pilihan_divisi != 4);
                                    break;
                                case 4: // Logout
                                    System.out.print("Berhasil Logout");
                                    break;
                                default:
                                    System.out.println("Pilihan menu tidak tersedia :(");
                            }
                            System.out.print("\n");
                        }while(pilihan_management != 4);
                    }
                    else{
                        System.out.println("\nLogin gagal");
                    }
                    System.out.println("=========================");
                    break;
                case 3: // Keluar Program
                    System.out.println("Thank You :)");
                    break;
                default:
                    System.out.println("Pilihan menu tidak tersedia :(");
            }
            System.out.print("\n");
        }while(pilihan != 3);
    }
}