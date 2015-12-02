package gsb.test;

import gsb.modele.Medicament;
import gsb.service.AffichageModele;
import gsb.service.MedicamentService;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class MedicamentServiceTest {

	public static void main(String[] args) {
		String unDepotLegal = "E089";
		Medicament unMedicament = MedicamentService.rechercherMedicament(unDepotLegal);
		if (unMedicament!=null) AffichageModele.afficherMedicament(unMedicament);
		else System.out.println("pas de Médicament pour le dépôt légal "+unDepotLegal);		
	}
	
}
