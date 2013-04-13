//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 03:08:47 PM CEST 
//


package aufgabe_4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aufgabe_4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aufgabe_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezeptliste }
     * 
     */
    public Rezeptliste createRezeptliste() {
        return new Rezeptliste();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept }
     * 
     */
    public Rezeptliste.Rezept createRezeptlisteRezept() {
        return new Rezeptliste.Rezept();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Kommentarliste }
     * 
     */
    public Rezeptliste.Rezept.Kommentarliste createRezeptlisteRezeptKommentarliste() {
        return new Rezeptliste.Rezept.Kommentarliste();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zutatenliste }
     * 
     */
    public Rezeptliste.Rezept.Zutatenliste createRezeptlisteRezeptZutatenliste() {
        return new Rezeptliste.Rezept.Zutatenliste();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zubereitung }
     * 
     */
    public Rezeptliste.Rezept.Zubereitung createRezeptlisteRezeptZubereitung() {
        return new Rezeptliste.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Kommentarliste.Kommentar }
     * 
     */
    public Rezeptliste.Rezept.Kommentarliste.Kommentar createRezeptlisteRezeptKommentarlisteKommentar() {
        return new Rezeptliste.Rezept.Kommentarliste.Kommentar();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zutatenliste.Zutat }
     * 
     */
    public Rezeptliste.Rezept.Zutatenliste.Zutat createRezeptlisteRezeptZutatenlisteZutat() {
        return new Rezeptliste.Rezept.Zutatenliste.Zutat();
    }

}
