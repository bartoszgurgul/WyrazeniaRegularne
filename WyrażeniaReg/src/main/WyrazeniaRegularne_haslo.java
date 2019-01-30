/**
 * 
 */
package main;

import java.util.regex.Pattern;

/**
 * @author BartoszGurgul
 * sprawdzanie musi sprawdzac jedynie czy dany znak sie wogole znajduje 
 * jest to pozyteczne przy sprawdzaniu hase³
 * 
 * Ignorowanie kolejnosci 
 * - 
 * 
 * 
 * 
 * (?=.*\\d) - dopasuj istnieje dowolny znak z zakresu 0-9
 * (?=.*[a-z]) - dowolny znak z zakresu a-z
 * (?=.*[A-Z]) - dowolny znak z zakresu A-Z
 * (?=.*[\\!\\@\\#\\$\\* ]) - dowolny znak z zakresu !@#$*
 * (?!.*\\s) - ¿aden znak nie moze byc spacj¹ - je¿eli = znastapimy ! to bêdzie oznaczac wykluczenie 
 * (?=.*\\d).{8,12} - oznacza dowolny znak z zakresy 0-9 i musi byc d³ugosci 8-12 znaków
 */
public class WyrazeniaRegularne_haslo {

	/**
	 * @param args
	 */
	public static boolean checkPassword(String password) {
		Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\!\\@\\#\\$\\*])(?!.*\\s).{8,12}$");
		return p.matcher(password).matches();
	}

}
