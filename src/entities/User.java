/**
 * 
 */
package entities;

/**
 * @author user
 *
 */
public class User {
	protected int iduser;
	protected String nom;
	protected String prenom;
	protected String login;
	protected String password;

	/**
	 * Default constructor
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param iduser
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public User(int iduser, String nom, String prenom, String login,
			String password) {
		super();
		this.iduser = iduser;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	/**
	 * constructeur permettant de mettre à jour le login de l'utilisateur sur
	 * base de son identifiant
	 * 
	 * @see #updateuserlogin()
	 * @param iduser
	 */
	public User(int iduser, String login) {
		super();
		this.iduser = iduser;
		this.login = login;
	}

	/**
	 * @param iduser
	 */
	public User(int iduser) {
		super();
		this.iduser = iduser;
	}

	/**
	 * constructeur permettant de mettre à jour le login de l'utilisateur sur
	 * base de son identifiant
	 * 
	 * @see #updateuserlogin()
	 * @param login
	 * @param password
	 */
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	/**
	 * @return the iduser
	 */
	public int getIduser() {
		return iduser;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param iduser
	 *            the iduser to set
	 */
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * methode toString
	 * 
	 * @toString affiche les informations de l'utilisateur
	 */
	@Override
	public String toString() {
		return "User{" + "iduser=" + iduser + ", nom=" + nom + ", prenom="
				+ prenom + ", login=" + login + ", password=" + password + '}';
	}
}
