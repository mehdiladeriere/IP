/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CSVParser {
    
    public static void main(String[] args) {
		
		try {
			String csvFile = "/home/imen/Téléchargements/TP3.csv";
			String delimiter = ";";
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
					if (lineID > 1) {
						if (fieldID == 1) {
							String r = strToken.nextToken();
							System.out.println("Voila" + r);
						}
					}
				}
				fieldID = 0;
			}
		}
		catch (IOException ex) {
			Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    
}
