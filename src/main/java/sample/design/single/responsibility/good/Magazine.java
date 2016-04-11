package sample.design.single.responsibility.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 12:25:33 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Magazine implements ReadingMaterial {

	private static final String MAGAZINE = "Magazine";
	private int magazineId;

	public void setMagazineId(int magazineId) {
		this.magazineId = magazineId;
	}

	public int getId() {
		return magazineId;
	}

	public String getType() {
		return MAGAZINE;
	}

}
