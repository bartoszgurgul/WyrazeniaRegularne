/**
 * 
 */
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ZNAKI SPECJALNE 
 * ^ - poczatek wzorca
 * $ - koniec wzorca
 // / - znak specjalny (nie moge miec zwyklego komenatrza bo sie jebie)
 * 
 * ZANKI ------------------------------------------
 * [0-9] = \\d
 * [^0-9] = \\D
 * [a-zA-Z] = \\w
 * [^a-zA-Z] = \\W
 * \\s - dowolny znak bia³y 
 * \\S - wszystko ale nie znaki bia³e
 * \\t - moze byc tabulator 
 * \\n - znak nowej lini
 * \.  - dowolny znak 
 * 
 * 
 * ILOSC WYSTAPIEN ZNAKOW--------------------------
 * [a]{x} - x wystapien
 * [a]{1,} [a]+ 	od 1 do nieskonczonosc 
 * [a]{1,3} 		od 1 do 3
 * [a]{0,} [a]*		od 0 do nieskonczonosc
 * [a]{0,1} [a]? 	od 0 do 1 wystapien
 *
 */
public class WyrazeniaRegularne {
	public static void main(String[] args) {
		// walidacja kodu pocztowego 
		Pattern p = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
		Matcher m = p.matcher("00-900");
		
		
		System.out.println(m.matches());
		// walidacja adresu email 
		String[] str = {"test@google.com"
				,"test.test@google.com"
				,"test.test@google.com.pl"
				,"test123@google.com"
				,"test_test@google.com"
				,"123test.test@google.cp"
				,"_@google.com"
				,"!@google.com"
				,"aaa_@google"};
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+[\\.a-zA-Z0-9]*@[a-zA-Z]+\\.[a-z]{2,}[\\.a-z]*$");
		for(int x =0;x<str.length;x++) {
			System.out.println(str[x]+": " + pattern.matcher(str[x]).matches());

		
		}
		}
}
