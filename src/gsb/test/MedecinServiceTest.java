package gsb.test;

import gsb.modele.Medecin;
import gsb.service.MedecinService;
import gsb.service.AffichageModele;

public class MedecinServiceTest {

	public static void main(String[] args) {
		String unCode = "E089";
		Medecin unMedecin = MedecinService.rechercherMedecin(unCode);
		if (unMedecin!=null) AffichageModele.afficherMedecin(unMedecin);
		else System.out.println("pas de Medecin pour le Code "+unCode);		
	}
	
}
