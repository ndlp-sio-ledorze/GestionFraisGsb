package gsb.test;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;
import gsb.service.AffichageModele;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class VisiteurDaoTest {

	public static void main(String[] args) {
		String unMatricule = "E089";
		Visiteur unVisiteur = VisiteurDao.rechercherVisiteur(unMatricule);
		if (unVisiteur!=null) AffichageModele.afficherVisiteur(unVisiteur);
		else System.out.println("pas de Visiteur pour le matricule "+unMatricule);		
	}
	
}
