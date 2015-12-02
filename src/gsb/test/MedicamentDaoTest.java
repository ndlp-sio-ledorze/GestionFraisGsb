package gsb.test;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
import gsb.service.AffichageModele;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class MedicamentDaoTest {

	public static void main(String[] args) {
		String unDepotLegal = "E089";
		Medicament unMedicament = MedicamentDao.rechercherMedicament(unDepotLegal);
		if (unMedicament!=null) AffichageModele.afficherMedicament(unMedicament);
		else System.out.println("pas de Médicament pour le dépôt légal "+unDepotLegal);		
	}
	
}
