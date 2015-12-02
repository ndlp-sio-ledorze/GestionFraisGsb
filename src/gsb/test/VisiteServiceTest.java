package gsb.test;

import gsb.modele.Visite;
import gsb.service.VisiteService;
import gsb.service.AffichageModele;

/**
 * @author Erwan
 * @date 02/12/15
 */
public class VisiteServiceTest {

	public static void main(String[] args) {
		String uneReference = "E089";
		Visite uneVisite = VisiteService.rechercherVisite(uneReference);
		if (uneVisite!=null) AffichageModele.afficherVisite(uneVisite);
		else System.out.println("pas de Visite pour la reférence "+uneReference);		
	}
	
}
