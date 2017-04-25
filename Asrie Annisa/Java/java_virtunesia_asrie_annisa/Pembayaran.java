
public class Pembayaran {
	private String id_pembayaran;
	private double total_bayar;
	
	public Pembayaran(String ip, double total) {
		
		this.id_pembayaran=ip;
		this.total_bayar=total;
		Pemesanan p = new Pemesanan("P002", "25/04/2017");
		Kamar k = new Kamar("K001", "01A", 200000);
	}
	
	public double getTotal() {
		return total_bayar;
	}
	public void setTotalBayar(double total) {
		this.total_bayar = total;
	}
	
	public double hitung_bayar(){
		Kamar  u = new Kamar("K001", "01A", 200000);
		return this.getTotal()- u.getHarga();
	}
}
