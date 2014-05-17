package reviwer.model;

/**
 * Klasa reprezentuje ostrzezenie o nieoptymalnej konstrukcji. 
 */
public class Warning {
	/**
	 * Linia wystapienia.
	 */
	private int lineNumber;
	
	/**
	 * Objasnienie.
	 */
	private String commentary;

	/**
	 * Zwraca linie wystapienia. 
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	
	/**
	 * Ustawia linie wystapienia.
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	/**
	 * Zwraca objasnienie. 
	 */
	public String getCommentary() {
		return commentary;
	}
	
	/**
	 * Ustawia objasnienie. 
	 */
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
}
