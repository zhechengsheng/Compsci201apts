
public class Personality {
	
	private String myName;
	
	/**
	 * Construct a Personality object with a name
	 * @param name is used as the identifier for this object
	 */
	
	public Personality(String name) {
		// TODO: complete constructor
	}
	
	/**
	 * Construct a default Personality, identifier
	 * will be "they with no name"
	 */
	
	public Personality() {
		this("they with no name");
	}
	
	/**
	 * Returns this object's identifier
	 * @return this objects identifying String/label
	 */
	public String getName() {
		// TODO: complete this method
		return "ola";
	}
	
	/**
	 * Returns a String describing this object
	 * The String will be a minimum of four characters in length
	 * @return description of this object
	 */
	
	public String getDescription() {
		return "playful";
	}
}
