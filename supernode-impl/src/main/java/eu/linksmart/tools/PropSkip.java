/*
 * In case of German law being applicable to this license agreement, the following warranty and liability terms shall apply:
 *
 * 1. Licensor shall be liable for any damages caused by wilful intent or malicious concealment of defects.
 * 2. Licensor's liability for gross negligence is limited to foreseeable, contractually typical damages.
 * 3. Licensor shall not be liable for damages caused by slight negligence, except in cases 
 *    of violation of essential contractual obligations (cardinal obligations). Licensee's claims for 
 *    such damages shall be statute barred within 12 months subsequent to the delivery of the software.
 * 4. As the Software is licensed on a royalty free basis, any liability of the Licensor for indirect damages 
 *    and consequential damages - except in cases of intent - is excluded.
 *
 * This limitation of liability shall also apply if this license agreement shall be subject to law 
 * stipulating liability clauses corresponding to German law.
 */
package eu.linksmart.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;


public class PropSkip {
	private static final String CONFIGURATION_FILE = "NetworkManagerSuperNode/config/NM.properties";
	private HashMap properties;

	/* Bloque de inicializacion
	 */


	public PropSkip() {
		try {		
			FileInputStream f = null;
			
			f = new FileInputStream(CONFIGURATION_FILE);
			
			Properties tempProperties = new Properties();

	    	try {
	    		tempProperties.load(f);
		    } catch(IOException e) {
		    	System.out.println(e.getMessage());
		    	System.out.println(e.getStackTrace());
		    }			
			
			f.close();
			properties = new HashMap(tempProperties);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
	}

	public String getProperty(String nombre) {

			String valor = (String) properties.get(nombre);
		    if (valor == null)
		        System.err.println("ERROR. Wrong property Field: " + nombre + "\n");
			
			return valor;
	}
	
	public static void main(String[] args) {
	    	String devuelveNull;
	    	try {
	    		/* Buscamos algunos valores
	    		 */
	    	
	    	
	    	


	    	} catch (Exception e) {
	    		System.out.println(e);
	    		devuelveNull = "Valor por defecto";
	    	}
	  	}
	}
