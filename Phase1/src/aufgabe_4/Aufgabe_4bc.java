package aufgabe_4;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import aufgabe_4.Rezeptliste.Rezept;
import aufgabe_4.Rezeptliste.Rezept.Kommentarliste.Kommentar;
import aufgabe_4.Rezeptliste.Rezept.Zutatenliste.Zutat;

public class Aufgabe_4bc {

	private static Scanner in;
	private static File xmlFile;

	private static void alleRezepteAusgeben(Rezeptliste liste)
	{
		if(liste != null)
		{
			int counter = 1;
			for(Rezept rezept : liste.getRezept())
			{
				System.out.println("Rezept " + counter++);
				System.out.println(rezept.bezeichnung);
				System.out.println(rezept.zutatenliste.anzahlPortionen + " Portion(en)");
				System.out.println("\nZutaten:");
				for(Zutat zutat : rezept.zutatenliste.zutat){
					if(zutat.mengeneinheit != null)
						System.out.println(zutat.menge + " " + zutat.mengeneinheit + " " + zutat.zutatenname);
					else
						System.out.println(zutat.menge + " " + zutat.zutatenname);
				}
				System.out.println("\nZubereitung");
				System.out.println("Schwierigkeit: " + rezept.zubereitung.schwierigkeit);
				System.out.println("Arbeitszeit: ca. " + rezept.zubereitung.dauer + " min.");
				if(rezept.zubereitung.brennwert != null)
					System.out.println("Brennwert: " + rezept.zubereitung.brennwert + " kcal");
				else
					System.out.println("Brennwert: keine Angabe");
				
				System.out.println(rezept.zubereitung.beschreibung);
				System.out.print("\n");
				
				if(rezept.kommentarliste.kommentar != null){
					System.out.println("Kommentare");
					for(Kommentar kommentar : rezept.kommentarliste.kommentar)
					{
						System.out.println(kommentar.datum);
						System.out.println(kommentar.username);
						System.out.println(kommentar.text);
						System.out.println("\n");
					}
				}
			}
		}
	}
	
	private static Rezeptliste rezepteAuslesen(File xmlFile)
	{
		try
		{
			JAXBContext context = JAXBContext.newInstance("aufgabe_4");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (Rezeptliste)unmarshaller.unmarshal(xmlFile);
		}
		catch(Exception ex)
		{
			return null;
		}
	}
	
	private static void rezeptAusgeben(Rezeptliste liste, int rezeptNr)
	{
		List<Rezept> rezepte = liste.rezept;
		if(rezeptNr >= 0 && rezeptNr < rezepte.size())
		{
			Rezept rezept = rezepte.get(rezeptNr);
			System.out.println(rezept.bezeichnung);
			System.out.println(rezept.zutatenliste.anzahlPortionen + "Portion(en)");
			System.out.println("Zutaten");
			for(Zutat zutat : rezept.zutatenliste.zutat){
				if(zutat.mengeneinheit != null)
					System.out.println(zutat.menge + " " + zutat.mengeneinheit + " " + zutat.zutatenname);
				else
					System.out.println(zutat.menge + " " + zutat.zutatenname);
			}
			System.out.println("Zubereitung");
			System.out.println("Schwierigkeit: " + rezept.zubereitung.schwierigkeit);
			System.out.println("Arbeitszeit: ca. " + rezept.zubereitung.dauer + " min.");
			if(rezept.zubereitung.brennwert != null)
				System.out.println("Brennwert: " + rezept.zubereitung.brennwert + " kcal");
			else
				System.out.println("Brennwert: keine Angabe");
			
			System.out.println(rezept.zubereitung.beschreibung);
			System.out.print("\n");
			
			if(rezept.kommentarliste.kommentar != null){
				System.out.println("Kommentare");
				for(Kommentar kommentar : rezept.kommentarliste.kommentar)
				{
					System.out.println(kommentar.datum);
					System.out.println(kommentar.username);
					System.out.println(kommentar.text);
					System.out.println("\n");
				}
			}
		}
	}
	
	private static void kommentarSpeichern(Kommentar kommentar, Rezeptliste liste, int rezeptNr)
	{
		List<Rezept> rezepte = liste.rezept;
		if(rezeptNr >= 0 && rezeptNr < rezepte.size())
		{
			Rezept rezept = rezepte.get(rezeptNr);
			rezept.kommentarliste.kommentar.add(kommentar);
		}
		schreibeInDatei(liste, xmlFile);
	}
	
	private static void schreibeInDatei(Rezeptliste liste, File file) {
		try
		{
			JAXBContext context = JAXBContext.newInstance("aufgabe_4");
		    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    m.marshal(liste, file);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		xmlFile = new File("C:\\Users\\David\\Documents\\GitHub\\WBA2\\WBA2_Phase1\\Phase1\\src\\aufgabe_3\\Aufgabe_3d.xml");
		
		int auswahl = 0;
		do{
		System.out.println("Menue");
		System.out.println("[1] Ausgabe aller Rezepte");
		System.out.println("[2] Ausgabe eines bestimmten Rezepts");
		System.out.println("[3] Kommentar zu einem Rezept schreiben");
		auswahl = in.nextInt();
		}while(auswahl < 1 || auswahl > 3);
		
		switch(auswahl)
		{
		case 1:
			alleRezepteAusgeben(rezepteAuslesen(xmlFile));
			break;
		case 2:
			System.out.println("Geben Sie bitte die Nummer des Rezepts ein:");
			int rezeptNr = in.nextInt();
			rezeptAusgeben(rezepteAuslesen(xmlFile), rezeptNr);
			break;
		case 3:
			System.out.println("Geben Sie bitte die Nummer des Rezepts ein:");
			int nr = in.nextInt();
			Kommentar kommentar = new Kommentar();
			System.out.println("Geben Sie bitte Ihren Usernamen ein:");
			kommentar.username = in.next();
			System.out.println("Geben Sie bitte den Kommentar ein:");
			kommentar.text = in.next();
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			XMLGregorianCalendar date2;
			try {
				date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				kommentar.datum = date2;
				kommentar.id = rezepteAuslesen(xmlFile).rezept.get(nr).kommentarliste.kommentar.size() + 1;
				
			} catch (DatatypeConfigurationException e) {
			}
			kommentarSpeichern(kommentar, rezepteAuslesen(xmlFile), nr);	
			break;
		}
	}

}
