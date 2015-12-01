package gsb.service;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class VisiteurService {
	
	public static Visiteur rechercherVisiteur(String unCodeVisiteur){
		Visiteur unVisiteur = null;
		try{
		if (unCodeVisiteur==null) {
            throw new Exception("Donnée obligatoire : code visiteur");
        }
		unVisiteur = VisiteurDao.rechercherVisiteur(unCodeVisiteur);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unVisiteur;
	}
	
}