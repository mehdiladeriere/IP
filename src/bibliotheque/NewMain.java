
package bibliotheque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NewMain {

	public static void main(String[] args) {
		//ATTRIBUTS
            
                int anneeDeces=0;
		int anneeNaissance=0;
		String nom="";
		String prenom="";
		
		//ArrayList<BienImmo> lesBienImmo = new ArrayList<BienImmo>();
		
		try {
			String csvFile = "/home/laderiere/Documents/SLAM5/bibliotheque/auteurs.txt";
			String delimiter = ",";
			String line = null;
			StringTokenizer strToken = null;
			BufferedReader bufferReader;
			
			int lineID = 0;
			int fieldID = 0;
			
			//OUVRIR LE FICHIER CSV
			bufferReader = new BufferedReader(new FileReader(csvFile));
			
			//PARCOURIR LES LIGNES DU FICHIER CSV
			while ((line = bufferReader.readLine()) != null) {
				lineID++;
				
				//PARCOURIR LES CHAMPS SÉPARÉS PAR DELIMITER
				strToken = new StringTokenizer(line, delimiter);
				
				while (strToken.hasMoreTokens()) {
					fieldID++;
					System.out.println("Ligne " + lineID + " / champs " + fieldID + " : " + strToken.nextToken());
					
					if(fieldID==1) {
						anneeDeces = Integer.parseInt(strToken.nextToken());
					}
					
					if(fieldID==2) {
						anneeNaissance = Integer.parseInt(strToken.nextToken());;
					}
					
					if(fieldID==3) {
						nom = strToken.nextToken();
					}
					
					if(fieldID==4) {
						nom = strToken.nextToken();
					}
					

					
					fieldID=0;
				}
			}
		}
		catch (IOException ex) {
			Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}