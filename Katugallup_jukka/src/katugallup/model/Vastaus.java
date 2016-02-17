package katugallup.model;

public class Vastaus {
	
	private int id;
	private int kysymys_id;
	private String vastausteksti;
	private String vastaaja;
	private String vastausaika;
	
	public Vastaus() {
		super();
		
	}
	public Vastaus(int id, int kysymys_id, String vastausteksti, String vastaaja, String
			 vastausaika) {
		super();
		this.id = id;
		this.kysymys_id = kysymys_id;
		this.vastausteksti = vastausteksti;
		this.vastaaja = vastaaja;
		this.vastausaika = vastausaika;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVastausteksti() {
		return vastausteksti;
	}
	public void setVastausteksti(String vastausteksti) {
		this.vastausteksti = vastausteksti;
	}
	public String getVastaaja() {
		return vastaaja;
	}
	public void setVastaaja(String vastaaja) {
		this.vastaaja = vastaaja;
	}
	public String getVastausaika() {
		return vastausaika;
	}
	public void setVastausaika(String vastausaika) {
		this.vastausaika = vastausaika;
	}
	@Override
	public String toString() {
		return "Vastaus [id=" + id + ", vastausteksti=" + vastausteksti
				+ ", vastaaja=" + vastaaja + ", vastausaika=" + vastausaika
				+ "]";
	}
	public int getKysymys_id() {
		return kysymys_id;
	}
	public void setKysymys_id(int kysymys_id) {
		this.kysymys_id = kysymys_id;
	}
	
	

}
