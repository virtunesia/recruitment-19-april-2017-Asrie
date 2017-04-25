
public class user {

	private String id_user;
	private String nama_user;
	private String telepon;
	
	public user(String iu, String nu, String telepon){
		this.id_user=iu;
		this.nama_user=nu;
		this.telepon=telepon;
	}
	
	public String getIdUser() {
		return id_user;
	}


	public void setIdUser(String idUser) {
		this.id_user = idUser;
	}

	public String getNamaUser() {
		return nama_user;
	}
	public void setNoMeja(String nama_user) {
		this.nama_user = nama_user;
	}
	
	public String getTelepen() {
		return telepon;
	}


	public void setTelepeon(String telepon) {
		this.telepon = telepon;
	}

}
