package gsb.service;

import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;

/**
 * @author Erwan
 * @date 01/12/15
 */
public class VisiteService {
	
	public static Visite rechercherVisite(String unCodeVisite){
		Visite unVisite = null;
		try{
		if (unCodeVisite==null) {
            throw new Exception("Donnée obligatoire : code visite");
        }
		unVisite = VisiteDao.rechercherVisite(unCodeVisite);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unVisite;
	}
	
}