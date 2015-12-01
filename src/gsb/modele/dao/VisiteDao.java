package gsb.modele.dao;

import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Erwan
 * @date 16/10/15 
 */

public class VisiteDao {
	
	/**
	 * @param codeVisite
	 * @return Retourne une collection de Visites en fonction de son matricule
	 */
	public static Visite rechercherVisite(String referenceVisite){
		
		Medecin unMedecin=null;
		Visiteur unVisiteur=null;
		Visite unVisite=null;
		ResultSet reqSelectionMedecin = ConnexionMySql.execReqSelection("select * from Visite where referenceVisite='"+referenceVisite+"'");
		ResultSet reqSelectionVisiteur = ConnexionMySql.execReqSelection("select * from Visite where referenceVisite='"+referenceVisite+"'");
		ResultSet reqSelectionVisite = ConnexionMySql.execReqSelection("select * from Visite where referenceVisite='"+referenceVisite+"'");

		try {
			if (reqSelectionMedecin.next()) {
				unMedecin = new Medecin(reqSelectionMedecin.getString(1), reqSelectionMedecin.getString(2), reqSelectionMedecin.getString(3), reqSelectionMedecin.getString(4), reqSelectionMedecin.getString(6), reqSelectionMedecin.getString(7), reqSelectionMedecin.getString(8), reqSelectionMedecin.getString(9), reqSelectionMedecin.getString(10));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visite where referenceVisite='"+referenceVisite+"'");
			e.printStackTrace();	
		}
		try {
			if (reqSelectionVisiteur.next()) {
				unVisiteur = new Visiteur(reqSelectionVisiteur.getString(1), reqSelectionVisiteur.getString(2), reqSelectionVisiteur.getString(3), reqSelectionVisiteur.getString(4), reqSelectionVisiteur.getString(5), reqSelectionVisiteur.getString(6), reqSelectionVisiteur.getString(7),reqSelectionVisiteur.getString(8), reqSelectionVisiteur.getInt(9), reqSelectionVisiteur.getString(10), reqSelectionVisiteur.getString(11));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visite where referenceVisite='"+referenceVisite+"'");
			e.printStackTrace();	
		}
		try {
			if (reqSelectionVisite.next()) {
				unVisite = new Visite(reqSelectionVisite.getString(1), reqSelectionVisite.getString(2), reqSelectionVisite.getString(3), unMedecin, unVisiteur);	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visite where referenceVisite='"+referenceVisite+"'");
			e.printStackTrace();	
		}
		ConnexionMySql.fermerConnexionBd();
		return unVisite;
		
	}
	
	public static void creerVisite(Visite uneVisite){
		
		String requeteInsertion;
		String referenceVisite = uneVisite.getReferenceVisite();
		String date= uneVisite.getDateVisite();
		String commentaire = uneVisite.getCommentaireVisite();
		Medecin unMedecin = uneVisite.getLeMedecin();
		Visiteur unVisiteur = uneVisite.getLeVisiteur();
		
		
		try{
			requeteInsertion = "insert into Visite values('"+referenceVisite+"','"+date+"','"+commentaire+"','"+unMedecin+"','"+unVisiteur+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into Visite values('"+referenceVisite+"','"+date+"','"+commentaire+"','"+unMedecin+"','"+unVisiteur+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerVisite(String codeVisite){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from Visite where referenceVisite='"+codeVisite+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from Visite where referenceVisite='"+codeVisite+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Visite> retournerCollectionDesVisites(){
		ArrayList<Visite> collectionDesVisites= new ArrayList<Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select referenceVisite from Visite");
		try{
		while (reqSelection.next()) {
			String codeVisite = reqSelection.getString(1);
		    collectionDesVisites.add(VisiteDao.rechercherVisite(codeVisite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisites()");
		}
		return collectionDesVisites;
	}
	
}