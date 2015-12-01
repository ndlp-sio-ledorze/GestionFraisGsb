package gsb.modele.dao;

import gsb.modele.Medicament;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Erwan
 * @date 16/10/15 
 */

public class MedicamentDao {
	
	/**
	 * @param codeMedicament
	 * @return Retourne une collection de Medicaments en fonction de son matricule
	 */
	public static Medicament rechercherMedicament(String depotLegal){
		
		Medicament unMedicament=null;
		ResultSet reqSelectionMedicament = ConnexionMySql.execReqSelection("select * from Medicament where DEPOTLEGAL='"+depotLegal+"'");
		
		try {
			if (reqSelectionMedicament.next()) {
				unMedicament = new Medicament(reqSelectionMedicament.getString(1), reqSelectionMedicament.getString(2), reqSelectionMedicament.getString(3), reqSelectionMedicament.getString(4), reqSelectionMedicament.getString(5), reqSelectionMedicament.getFloat(6), reqSelectionMedicament.getString(7),reqSelectionMedicament.getString(8));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Medicament where DEPOTLEGAL='"+depotLegal+"'");
			e.printStackTrace();	
		}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
		
	}
	
	public static void creerMedicament(Medicament unMedicament){
		
		String requeteInsertion;
		String depotLegal = unMedicament.getDepotLegal();
		String nomCommercial= unMedicament.getNomCommercial();
		String composition = unMedicament.getComposition();
		String effets = unMedicament.getEffets();
		String contreIndication = unMedicament.getContreIndication();
		float prixEchantillon = unMedicament.getPrixEchantillon();
		String codeFamille = unMedicament.getCodeFamille();
		String libelleFamille = unMedicament.getLibelleFamille();
		
		
		try{
			requeteInsertion = "insert into MEDICAMENT values('"+depotLegal+"','"+nomCommercial+"','"+composition+"','"+effets+"','"+contreIndication+"','"+prixEchantillon+"','"+codeFamille+"','"+libelleFamille+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into MEDICAMENT values('"+depotLegal+"','"+nomCommercial+"','"+composition+"','"+effets+"','"+contreIndication+"','"+prixEchantillon+"','"+codeFamille+"','"+libelleFamille+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerMedicament(String codeMedicament){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from Medicament where DEPOTLEGAL='"+codeMedicament+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from MEDICAMENT where DEPOTLEGAL='"+codeMedicament+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Medicament> retournerCollectionDesMedicaments(){
		ArrayList<Medicament> collectionDesMedicaments= new ArrayList<Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select DEPOTLEGAL from MEDICAMENT");
		try{
		while (reqSelection.next()) {
			String codeMedicament = reqSelection.getString(1);
		    collectionDesMedicaments.add(MedicamentDao.rechercherMedicament(codeMedicament));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesMedicaments()");
		}
		return collectionDesMedicaments;
	}
	
}