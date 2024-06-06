package textadventure;


public class Frage {

	private String titel;
	private String text;
	private String antwort1;
	private String antwort2;
	private int richtigeAntwort;
	
	public Frage(String titel, String text, String antwort1, String antwort2, String word4, int richtigeAntwort) {
		this.titel = titel;
		this.text = text;
		this.antwort1 = antwort1;
		this.antwort2 = antwort2;
		this.richtigeAntwort = richtigeAntwort;
                
	}

    Frage(String word, String word0, int richtig) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
	public String getTitel() {
		return titel;
	}
        public String getText() {
		return text;
	}
	public String getAntwort1() {
		return antwort1;
	}
	public String getAntwort2() {
		return antwort2;
	}
	public int getRichtigeAntwort() {
            
		return richtigeAntwort;
	}
	
	
	
}
