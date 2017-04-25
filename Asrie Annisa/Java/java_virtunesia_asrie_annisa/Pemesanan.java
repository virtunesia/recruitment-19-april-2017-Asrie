
public class Pemesanan {

	
		private String id_pesan;
		private String tgl_pesan;
		
		public Pemesanan(String ip, String tgl){
			
				user u = new user("U001","Tiwi", "081282491681");
				Kamar k = new Kamar("K001", "01A", 200000);
				
				this.tgl_pesan=tgl;
				this.id_pesan=ip;
		}
		
		
		public String getIdPesan() {
			return id_pesan;
		}
		public void setIdPesan(String id) {
			this.id_pesan = id;
		}
		
		public void Check_in() {
			
		}
		
		

		
	


}
