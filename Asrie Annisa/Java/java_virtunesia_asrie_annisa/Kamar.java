
public class Kamar {

	private String id_kamar;
	private String no_kamar;
	private double harga;
	
	public Kamar(String ik, String nk, double harga){
		this.id_kamar=ik;
		this.no_kamar=nk;
		this.harga=harga;
	}
	

	public String getIdKamar() {
		return id_kamar;
	}


	public void setIdKamar(String idKamar) {
		this.id_kamar = idKamar;
	}

	public String getNoKamar() {
		return no_kamar;
	}
	public void setNoKamar(String nokamar) {
		this.no_kamar = nokamar;
	}
	
	public double getHarga() {
		return harga;
	}


	public void setHarga(double harga) {
		this.harga = harga;
	}

	
}
