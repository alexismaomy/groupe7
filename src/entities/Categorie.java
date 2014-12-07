/**
 * 
 */
package entities;

/**
 * @author user
 *
 */
public class Categorie {
	protected int idcategorie;
	protected String nom;

	/**
	 * @param idcat
	 */
	public Categorie(int idcat) {
		super();
		this.idcategorie = idcat;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 */
	public Categorie(String nom) {
		super();
		this.nom = nom;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idcategorie
	 * @param nom
	 */
	public Categorie(int idcategorie, String nom) {
		super();
		this.idcategorie = idcategorie;
		this.nom = nom;
	}

	/**
	 * @return the idcategorie
	 */
	public int getIdcategorie() {
		return idcategorie;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param idcategorie
	 *            the idcategorie to set
	 */
	public void setIdcategorie(int idcategorie) {
		this.idcategorie = idcategorie;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
