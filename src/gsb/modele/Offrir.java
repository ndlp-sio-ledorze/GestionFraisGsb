package gsb.modele;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class Offrir {
	
	protected int qteOfferte;
	protected Medicament leMedicament;
	protected Visite laVisite;
	
	/**
	 * Constructeur
	 * @param uneQteOfferte
	 * @param unMedicament
	 * @param uneVisite
	 */
	public Offrir(int uneQteOfferte, Medicament unMedicament, Visite uneVisite){
		
		this.qteOfferte=uneQteOfferte;
		this.leMedicament=unMedicament;
		this.laVisite=uneVisite;
		
	}

	public int getQteOfferte() {
		return qteOfferte;
	}

	public void setQteOfferte(int qteOfferte) {
		this.qteOfferte = qteOfferte;
	}

	public Medicament getLeMedicament() {
		return leMedicament;
	}

	public void setLeMedicament(Medicament leMedicament) {
		this.leMedicament = leMedicament;
	}

	public Visite getLaVisite() {
		return laVisite;
	}

	public void setLaVisite(Visite laVisite) {
		this.laVisite = laVisite;
	}
	
}
