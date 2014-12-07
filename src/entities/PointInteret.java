/**
 * 
 */
package entities;

/**
 * @author user
 *
 */
public class PointInteret {
	protected int idpoint;
	protected String nom;
	protected String description;
	protected double longitude;
	protected double latitude;
	protected User u;

	/**
	 * @param idpoint
	 * @param nom
	 * @param description
	 * @param longitude
	 * @param latitude
	 */
	public PointInteret(int idpoint, String nom, String description,
			double longitude, double latitude) {
		super();
		this.idpoint = idpoint;
		this.nom = nom;
		this.description = description;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * @param nom
	 * @param description
	 * @param longitude
	 * @param latitude
	 */
	public PointInteret(String nom, String description, double longitude,
			double latitude) {
		super();
		this.nom = nom;
		this.description = description;
		this.longitude = longitude;
		this.latitude = latitude;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param description
	 * @param longitude
	 * @param latitude
	 */
	public PointInteret(User u, String nom, String description,
			double longitude, double latitude) {
		super();
		this.u = u;
		this.nom = nom;
		this.description = description;
		this.longitude = longitude;
		this.latitude = latitude;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param description
	 */
	public PointInteret(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	/**
	 * @param idpoint
	 */
	public PointInteret(int idpoint) {
		super();
		this.idpoint = idpoint;
	}

	/**
	 * @return the idpoint
	 */
	public int getIdpoint() {
		return idpoint;
	}

	/**
	 * @return the u
	 */
	public User getU() {
		return u;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param idpoint
	 *            the idpoint to set
	 */
	public void setIdpoint(int idpoint) {
		this.idpoint = idpoint;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointInteret [idpoint=" + idpoint + ", nom=" + nom
				+ ", description=" + description + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}

}
