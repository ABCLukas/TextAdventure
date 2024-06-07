package quiz;


public class Frage {

	private String frage;
	private String antwort1;
	private String antwort2;
	private String antwort3;
	private String antwort4;
	private int richtigeAntwort;
	
	public Frage(String frage, String antwort1, String antwort2, String antwort3, String antwort4,
			int richtigeAntwort) {
		this.frage = frage;
		this.antwort1 = antwort1;
		this.antwort2 = antwort2;
		this.antwort3 = antwort3;
		this.antwort4 = antwort4;
		this.richtigeAntwort = richtigeAntwort;
                
	}
	
	
	public String getFrage() {
		return frage;
	}
	public String getAntwort1() {
		return antwort1;
	}
	public String getAntwort2() {
		return antwort2;
	}
	public String getAntwort3() {
		return antwort3;
	}
	public String getAntwort4() {
		return antwort4;
	}
	public int getRichtigeAntwort() {
            
		return richtigeAntwort;
	}
	
	
	
}
