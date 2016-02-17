package katugallup.model;

public class Kysymys {
	
	private int id;
	private String kysymysteksti;
	
	
	
	public Kysymys() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Kysymys(int id, String kysymysteksti) {
		super();
		this.id = id;
		this.kysymysteksti = kysymysteksti;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getKysymysteksti() {
		return kysymysteksti;
	}



	public void setKysymysteksti(String kysymysteksti) {
		this.kysymysteksti = kysymysteksti;
	}



	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", kysymysteksti=" + kysymysteksti + "]";
	}
	

}
