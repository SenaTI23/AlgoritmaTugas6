public class PendakianGunungSemeru {
    public static void main(String[] args) {
        int tenaga = 12;
        String jalur = "LLLLLUPURUUPDLLPLDDDLPUULLPDDLPUUUUU";
        
        for (int i = 0; i < jalur.length(); i++) {
            char langkah = jalur.charAt(i);
            
            if (tenaga <= 0) {
                System.out.println("Maaf, Anda kehabisan tenaga. Pendakian gagal.");
                break;
            }
            
            if (langkah == 'L') {
           
            } else if (langkah == 'R') {
           
            } else if (langkah == 'U') {
            
            } else if (langkah == 'D') {
            
            } else if (langkah == 'P') {
                tenaga += 10;
            }
            
            tenaga--;
        }
        
        if (tenaga > 0) {
            System.out.println("Selamat Pendakian Anda Berhasil Mencapai Puncak Semeru");
            System.out.println("Sisa Tenaga Anda: " + tenaga);
        }
    }
}

//Sena Fajar Santika
//20230040011
//TI23A