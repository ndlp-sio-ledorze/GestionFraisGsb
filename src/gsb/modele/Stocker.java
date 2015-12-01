package gsb.modele;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class Stocker {
	
	protected int qteStock;
	public Medicament leMedicament;
	public Visiteur leVisiteur;
	
	/**
	 * Constructeur
	 * @param uneQteStock
	 * @param unMedicament
	 * @param unVisiteur
	 */
	public Stocker(int uneQteStock, Medicament unMedicament, Visiteur unVisiteur){
		
		this.qteStock=uneQteStock;
		this.leMedicament=unMedicament;
		this.leVisiteur=unVisiteur;
		
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	public Medicament getLeMedicament() {
		return leMedicament;
	}

	public void setLeMedicament(Medicament leMedicament) {
		this.leMedicament = leMedicament;
	}

	public Visiteur getLeVisiteur() {
		return leVisiteur;
	}

	public void setLeVisiteur(Visiteur leVisiteur) {
		this.leVisiteur = leVisiteur;
	}
	
}
