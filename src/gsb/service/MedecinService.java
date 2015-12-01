package gsb.service;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

/**
 * @author Isabelle
 * 23 f�vr. 2015
 */
public class MedecinService {
	
	public static Medecin rechercherMedecin(String unCodeMedecin){
		Medecin unMedecin = null;
		try{
		if (unCodeMedecin==null) {
            throw new Exception("Donnée obligatoire : code médecin");
        }
		unMedecin = MedecinDao.rechercherMedecin(unCodeMedecin);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedecin;
	}
	
}