package gsb.modele;

/**
 * 
 * @author Erwan
 * @date 15/10/15
 *
 */

public class Visiteur {

	protected String matriculeVisiteur;
	protected String nomVisiteur;
	protected String prenomVisiteur;
	protected String loginVisiteur;
	protected String mdpVisiteur;
	protected String adresseVisiteur;
	protected String telephoneVisiteur;
	protected String dateEntreeVisiteur;
	protected int prime;
	protected String codeUnite;
	protected String nomUnite;
	
	
	/**
	 * Construteur
	 * @param unMatriculeVisiteur
	 * @param unNomVisiteur
	 * @param unPrenomVisiteur
	 * @param unLogin
	 * @param unMdp
	 * @param uneAdresseVisiteur
	 * @param unTelephoneVisiteur
	 * @param uneDateEntree
	 * @param unePrime
	 * @param unCodeUnite
	 * @param unNomUnite
	 */
	public Visiteur (String unMatriculeVisiteur, String unNomVisiteur, String unPrenomVisiteur, String unLogin, String unMdp, String uneAdresseVisiteur, String unTelephoneVisiteur, String uneDateEntree, int unePrime, String unCodeUnite, String unNomUnite ){
		
		this.matriculeVisiteur = unMatriculeVisiteur;
		this.nomVisiteur = unNomVisiteur;
		this.prenomVisiteur = unPrenomVisiteur;
		this.loginVisiteur = unLogin;
		this.mdpVisiteur = unMdp;
		this.adresseVisiteur = uneAdresseVisiteur;
		this.telephoneVisiteur = unTelephoneVisiteur;
		this.dateEntreeVisiteur = uneDateEntree;
		this.prime = unePrime;
		this.codeUnite = unCodeUnite;
		this.nomUnite = unNomUnite;
		
	}

	/**
	 * 
	 * @return Retourne le matricule du visiteur
	 */
	public String getMatriculeVisiteur() {
		return matriculeVisiteur;
	}

	/**
	 * 
	 * @param Set le matriculeVisiteur
	 */
	public void setMatriculeVisiteur(String matriculeVisiteur) {
		this.matriculeVisiteur = matriculeVisiteur;
	}

	/**
	 * 
	 * @return Retourne le nom du visiteur
	 */
	public String getNomVisiteur() {
		return nomVisiteur;
	}

	/**
	 * 
	 * @param Set le nomVisiteur
	 */
	public void setNomVisiteur(String nomVisiteur) {
		this.nomVisiteur = nomVisiteur;
	}

	/**
	 * 
	 * @return Retourne le prénom du visiteur
	 */
	public String getPrenomVisiteur() {
		return prenomVisiteur;
	}

	/**
	 * 
	 * @param Set le prenomVisiteur
	 */
	public void setPrenomVisiteur(String prenomVisiteur) {
		this.prenomVisiteur = prenomVisiteur;
	}

	/**
	 * 
	 * @return Retourne le login du visiteur
	 */
	public String getLoginVisiteur() {
		return loginVisiteur;
	}

	/**
	 * 
	 * @param Set le loginVisiteur
	 */
	public void setLoginVisiteur(String loginVisiteur) {
		this.loginVisiteur = loginVisiteur;
	}

	/**
	 * 
	 * @return Return le mot de passe du visiteur
	 */
	public String getMdpVisiteur() {
		return mdpVisiteur;
	}

	/**
	 * 
	 * @param Set le mdpVisiteur
	 */
	public void setMdpVisiteur(String mdpVisiteur) {
		this.mdpVisiteur = mdpVisiteur;
	}

	/**
	 * 
	 * @return Retourne l'adresse du visiteur
	 */
	public String getAdresseVisiteur() {
		return adresseVisiteur;
	}

	/**
	 * 
	 * @param Set l'adresseVisiteur
	 */
	public void setAdresseVisiteur(String adresseVisiteur) {
		this.adresseVisiteur = adresseVisiteur;
	}

	/**
	 * 
	 * @return Retourne le numéro de téléphone du visiteur
	 */
	public String getTelephoneVisiteur() {
		return telephoneVisiteur;
	}

	/**
	 * 
	 * @param Set le telephoneVisiteur
	 */
	public void setTelephoneVisiteur(String telephoneVisiteur) {
		this.telephoneVisiteur = telephoneVisiteur;
	}

	/**
	 * 
	 * @return Retourne la date d'embauche du visiteur
	 */
	public String getDateEntreeVisiteur() {
		return dateEntreeVisiteur;
	}

	/**
	 * 
	 * @param Set la dateEntreeVisiteur
	 */
	public void setDateEntreeVisiteur(String dateEntreeVisiteur) {
		this.dateEntreeVisiteur = dateEntreeVisiteur;
	}

	/**
	 * 
	 * @return Retourne la prime du visiteur
	 */
	public int getPrime() {
		return prime;
	}

	/**
	 * 
	 * @param Set la prime
	 */
	public void setPrime(int prime) {
		this.prime = prime;
	}

	/**
	 * 
	 * @return Retourne le code de l'unité du visiteur
	 */
	public String getCodeUnite() {
		return codeUnite;
	}

	/**
	 * 
	 * @param Set le code de l'unité
	 */
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	/**
	 * 
	 * @return Retourne le nom de l'unité du visiteur
	 */
	public String getNomUnite() {
		return nomUnite;
	}

	/**
	 * 
	 * @param Set le nom de l'unité
	 */
	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}

}