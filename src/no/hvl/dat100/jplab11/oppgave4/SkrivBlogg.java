package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean skrevet = false;
		String melding = "";
		
		PrintWriter skriver = null;
		
		try {
			skriver = new PrintWriter(mappe+"/"+filnavn);
			String utskriv = samling.toString();
			skriver.print(utskriv);
		}
		
		catch (FileNotFoundException e){
			skrevet = false;
			melding = "Det har oppstått en feil";
		}
		
		catch (NumberFormatException e) {
			skrevet = false;
			melding = "Det har oppstått en feil";
		}
		
		finally {
			if(skriver != null) {
				skriver.close();
				skrevet = true;
			} 
			System.out.println(melding);
		}
		
		return skrevet;
	}
}