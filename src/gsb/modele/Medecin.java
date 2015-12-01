package gsb.modele;

/**
 * @author Erwan
 * @date 01/12/15
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class Medecin {
	protected String codeMed ;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String telephone;
	protected String potentiel;
	protected String specialite;
	protected String cp;
	protected String ville;
	/**
	 * @param codeMed
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param potentiel
	 * @param specialite
	 * @param unCP
	 * @param uneVille
	 */
	public Medecin(String codeMed, String nom, String prenom,
			String adresse, String telephone,
			String potentiel, String specialite, String unCP, String uneVille) {
		this.codeMed = codeMed;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.potentiel = potentiel;
		this.specialite = specialite;
		this.cp = unCP;
		this.ville = uneVille;
	}
	/**
	 * @return Renvoie codeMed.
	 */
	public String getCodeMed() {
		return codeMed;
	}
	/**
	 * @param codeMed codeMed � d�finir.
	 */
	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}
	/**
	 * @return Renvoie nom.
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom nom � d�finir.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return Renvoie prenom.
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom prenom � d�finir.
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return Renvoie adresse.
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse adresse � d�finir.
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return Renvoie telephone.
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone telephone � d�finir.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return Renvoie potentiel.
	 */
	public String getPotentiel() {
		return potentiel;
	}
	/**
	 * @param potentiel potentiel � d�finir.
	 */
	public void setPotentiel(String potentiel) {
		this.potentiel = potentiel;
	}
	/**
	 * @return Renvoie specialite.
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite specialite � d�finir.
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	

}