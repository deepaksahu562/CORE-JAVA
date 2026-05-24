package src.com.jlcindia;

import java.util.Arrays;
import java.util.Locale;

public class Lab11 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		Locale locales[]=Locale.getAvailableLocales();
		System.out.println("+++++++++++ Locales  +++++++++++++++++++++");
		for (int i = 0; i < locales.length; i++) {
			System.out.print(locales[i]+",");
		}
		System.out.println();
		System.out.println("+++++++++++ Countries  +++++++++++++++++++++");
		String countries[]=Locale.getISOCountries();
		int count=0;
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i]+",");
			count++;
		}
		System.out.println();
		System.out.println(count);
		System.out.println("+++++++++++ Languages  +++++++++++++++++++++");
		int count1=0;
		String languages[]=Locale.getISOLanguages();
		for (int i = 0; i < languages.length; i++) {
			System.out.print(languages[i]+",");
			count1++;
		}
		System.out.println();
		System.out.println(count1);
		
		System.out.println("=============================");
		Locale loc=new Locale("EN");
		System.out.println(loc.getCountry());
		System.out.println(loc.getDisplayCountry());
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayName());
		System.out.println(loc.getVariant());
		System.out.println(loc.getDisplayVariant());
		
		Locale loc1=new Locale("EN","US");
		System.out.println(loc1.getCountry());
		System.out.println(loc1.getDisplayCountry());
		System.out.println(loc1.getDisplayLanguage());
		System.out.println(loc1.getDisplayName());
		
	}

}
