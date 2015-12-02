package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class MedicamentService {
	
	public static Medicament rechercherMedicament(String unCodeMedicament){
		Medicament unMedicament = null;
		try{
		if (unCodeMedicament==null) {
            throw new Exception("Donnée obligatoire : dépot légal");
        }
		unMedicament = MedicamentDao.rechercherMedicament(unCodeMedicament);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedicament;
	}
	
}