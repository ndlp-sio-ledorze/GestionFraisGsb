package gsb.test;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;
import gsb.service.AffichageModele;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class MedecinDaoTest {

	public static void main(String[] args) {
		String unCode = "E089";
		Medecin unMedecin = MedecinDao.rechercherMedecin(unCode);
		if (unMedecin!=null) AffichageModele.afficherMedecin(unMedecin);
		else System.out.println("pas de Medecin pour le Code "+unCode);		
	}
	
}
