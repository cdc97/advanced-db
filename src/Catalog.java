

/**
 * 
 */

/**
 * @author 
 *
 */
public class Catalog {

	//singleton instance of Catalog
	private static Catalog catalog = null;
	
	
	/**
	 * Constructor used to create an instance of Catalog.
	 * Can only be called by the class itself (singleton pattern).
	 * Create any objects used for class storage here
	 */
	protected Catalog() {
		
	}
	
	/**
	 * Used to get an instance of Catalog. If one already exists,
	 * existing one is returned. Otherwise, creates a new instance, stores it in
	 * catalog variable, and returns it.
	 * @return singleton instance of Catalog.
	 */
	public static Catalog getInstance() {
		if (catalog == null) {
			catalog = new Catalog();
		}
		
		return catalog;
		
	}
}
