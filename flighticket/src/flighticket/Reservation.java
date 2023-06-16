package flighticket;

public class Reservation {
    public Airplane ucak;
    public Location lokasyon;
    public Customer musteri;
    public String tarih;
    public int koltukNo;

    public Reservation(Airplane ucak, Location lokasyon, Customer musteri, String tarih, int koltukNo) {
        this.ucak = ucak;
        this.lokasyon = lokasyon;
        this.musteri = musteri;
        this.tarih = tarih;
        this.koltukNo = koltukNo;
    }
}
