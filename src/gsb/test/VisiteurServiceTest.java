package gsb.test;

import gsb.modele.Visiteur;
import gsb.service.AffichageModele;
import gsb.service.VisiteurService;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class VisiteurServiceTest {

	public static void main(String[] args) {
		String unMatricule = "E089";
		Visiteur unVisiteur = VisiteurService.rechercherVisiteur(unMatricule);
		if (unVisiteur!=null) AffichageModele.afficherVisiteur(unVisiteur);
		else System.out.println("pas de Visiteur pour le matricule "+unMatricule);		
	}
	
}
