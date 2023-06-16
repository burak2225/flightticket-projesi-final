package flighticket;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class FlightReservation {
    public static void main(String[] args) {
        Airplane airp1 = new Airplane("Boeing", "737-900", "3/3/2023", 130);
        Airplane airp2 = new Airplane("Boeing", "736-900", "3/3/2023", 120);
        Airplane airp3 = new Airplane("Boeing", "735-900", "3/3/2023", 110);
        Airplane airp4 = new Airplane("Airbus", "321-200", "3/3/2023", 150);
        Airplane airp5 = new Airplane("Airbus", "320-200", "3/3/2023", 140);
 
        List<Airplane> aplanes = new ArrayList<>();
        aplanes.add(airp1);
        aplanes.add(airp2);
        aplanes.add(airp3);
        aplanes.add(airp4);
        aplanes.add(airp5);
        Random rand = new Random();
        int n = rand.nextInt(5);
        int m ;
        
        Airplane airp = aplanes.get(n);
        m = airp.capacity ;
        int kn = rand.nextInt(m);
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Merhaba, Rezervasyon işlemi için ülke giriniz... ");
        String ulk = scanner.nextLine();
        System.out.println("Gitmek istediğiniz şehri giriniz... ");
        String shr = scanner.nextLine();
        System.out.println("İstanbul üzerinden bir havalimanı seçiniz(sayı ile)\n1-Sabiha Gökçen Havalimanı\n2-Atatürk Havalimanı");
        String hvl = scanner.nextLine(); 
        Location lctn = new Location(ulk, shr, hvl);
        
        
        System.out.println("15.06.2023 tarihli 13.15 uçuşu bulunmaktadır, rezervasyon yapmak istiyor musunuz?(evet/hayır) ");
        String cvp = scanner.nextLine();
        if (cvp.equals("evet")) {
            System.out.println("İsminizi giriniz");
            String ism = scanner.nextLine();
            System.out.println("Cinsiyetiniz (E-0 / K-1) ");
            int cinsyt = scanner.nextInt();
            scanner.nextLine();
                
                
                System.out.println("Yaşınızı giriniz ");
                int ys = scanner.nextInt();
                boolean ysli = true;
                if (ys > 64)
                { ysli = true; }
                else { ysli = false; }
                System.out.println("Herhangi bir engeliniz bulunuyor mu? (Evet-1 / Hayır-0)");
                int engl = scanner.nextInt();
                
                
                Customer mstr = new Customer(ism, cinsyt, ys, ysli, engl);

                Reservation bilet = new Reservation(airp, lctn, mstr, "15.06.2023", kn);
                System.out.println("15.06.2023 saat 13.15 zamanlı uçuşunuz " + ism + " adına oluşturulmuştur."+ airp.model + airp.serialNum +" aracında koltuk numaranız-"+kn+ " İyi günler dileriz. ");
        	}
        else {
        	System.out.println("Uygun uçuş bulunmamaktadır.");
        }
        
    }
}
        