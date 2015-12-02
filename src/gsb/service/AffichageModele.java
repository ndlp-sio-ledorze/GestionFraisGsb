package gsb.service;

import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class AffichageModele {
	
	public static void afficherVisiteur(Visiteur unVisiteur){
		System.out.println("Matricule Visiteur :"+unVisiteur.getMatriculeVisiteur());
		System.out.println("Nom Visiteur :"+unVisiteur.getNomVisiteur());
		System.out.println("Prenom Visiteur :"+unVisiteur.getPrenomVisiteur());
		System.out.println("Login Visiteur :"+unVisiteur.getLoginVisiteur());
		System.out.println("Mot de passe Visiteur :"+unVisiteur.getMdpVisiteur());
		System.out.println("Adresse Visiteur :"+unVisiteur.getAdresseVisiteur());
		System.out.println("Téléphone Visiteur :"+unVisiteur.getTelephoneVisiteur());
		System.out.println("Date d'embauche Visiteur :"+unVisiteur.getDateEntreeVisiteur());
	}
	
	public static void afficherMedecin(Medecin unMedecin){
		System.out.println("Code Medecin :"+unMedecin.getCodeMed());
		System.out.println("Nom Medecin :"+unMedecin.getNom());
		System.out.println("Prénom Medecin :"+unMedecin.getPrenom());
		System.out.println("Adresse Medecin :"+unMedecin.getAdresse());
		System.out.println("Télephone Medecin :"+unMedecin.getTelephone());
		System.out.println("Potentiel Medecin :"+unMedecin.getPotentiel());
		System.out.println("Spécialité Medecin :"+unMedecin.getSpecialite());
		System.out.println("Code Postal Medecin :"+unMedecin.getCp());
		System.out.println("Ville Medecin :"+unMedecin.getVille());
	}
	
	public static void afficherMedicament(Medicament unMedicament){
		System.out.println("Dépot Légal Médicament :"+unMedicament.getDepotLegal());
		System.out.println("Nom Médicament :"+unMedicament.getNomCommercial());
		System.out.println("Composition Médicament :"+unMedicament.getComposition());
		System.out.println("Effets Médicament :"+unMedicament.getEffets());
		System.out.println("Contre Indication Médicament :"+unMedicament.getContreIndication());
		System.out.println("Prix Echantillon Médicament :"+unMedicament.getPrixEchantillon());
		System.out.println("Code Famille Médicament :"+unMedicament.getCodeFamille());
		System.out.println("Libelle Famille Médicament :"+unMedicament.getLibelleFamille());
	}

	public static void afficherVisite(Visite uneVisite){
		System.out.println("Reférence Visite :"+uneVisite.getReferenceVisite());
		System.out.println("Reférence Visite :"+uneVisite.getDateVisite());
		System.out.println("Reférence Visite :"+uneVisite.getCommentaireVisite());
		System.out.println("----------Medecin---------");
		afficherMedecin(uneVisite.getLeMedecin());
		System.out.println("----------Visite----------");
		afficherVisiteur(uneVisite.getLeVisiteur());
	}
	
}
