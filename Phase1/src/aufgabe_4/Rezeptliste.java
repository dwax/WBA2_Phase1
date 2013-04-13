//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 03:08:47 PM CEST 
//


package aufgabe_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="rezept">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="zutatenliste">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="zutat">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="zutatenname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="menge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="mengeneinheit">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="g"/>
 *                                           &lt;enumeration value="l"/>
 *                                           &lt;enumeration value="Tl"/>
 *                                           &lt;enumeration value="El"/>
 *                                           &lt;enumeration value="ml"/>
 *                                           &lt;enumeration value="Bund"/>
 *                                           &lt;enumeration value="Würfel"/>
 *                                           &lt;enumeration value="Becher"/>
 *                                           &lt;enumeration value="Pkt."/>
 *                                           &lt;enumeration value="evtl."/>
 *                                           &lt;enumeration value="Stück"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="anzahlPortionen" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zubereitung">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                           &lt;attribute name="dauer" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="schwierigkeit" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="simpel"/>
 *                                 &lt;enumeration value="normal"/>
 *                                 &lt;enumeration value="pfiffig"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="kommentarliste">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="kommentar">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/all>
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezept"
})
@XmlRootElement(name = "rezeptliste")
public class Rezeptliste {

    @XmlElement(required = true)
    protected List<Rezeptliste.Rezept> rezept;

    /**
     * Gets the value of the rezept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rezeptliste.Rezept }
     * 
     * 
     */
    public List<Rezeptliste.Rezept> getRezept() {
        if (rezept == null) {
            rezept = new ArrayList<Rezeptliste.Rezept>();
        }
        return this.rezept;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="zutatenliste">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="zutat">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="zutatenname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="menge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="mengeneinheit">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="g"/>
     *                                 &lt;enumeration value="l"/>
     *                                 &lt;enumeration value="Tl"/>
     *                                 &lt;enumeration value="El"/>
     *                                 &lt;enumeration value="ml"/>
     *                                 &lt;enumeration value="Bund"/>
     *                                 &lt;enumeration value="Würfel"/>
     *                                 &lt;enumeration value="Becher"/>
     *                                 &lt;enumeration value="Pkt."/>
     *                                 &lt;enumeration value="evtl."/>
     *                                 &lt;enumeration value="Stück"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="anzahlPortionen" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zubereitung">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *                 &lt;attribute name="dauer" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="schwierigkeit" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="simpel"/>
     *                       &lt;enumeration value="normal"/>
     *                       &lt;enumeration value="pfiffig"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="kommentarliste">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="kommentar">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/all>
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="bezeichnung" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Rezept {

        @XmlElement(required = true)
        protected Rezeptliste.Rezept.Zutatenliste zutatenliste;
        @XmlElement(required = true)
        protected Rezeptliste.Rezept.Zubereitung zubereitung;
        @XmlElement(required = true)
        protected Rezeptliste.Rezept.Kommentarliste kommentarliste;
        @XmlAttribute(name = "bezeichnung", required = true)
        protected String bezeichnung;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Ruft den Wert der zutatenliste-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezeptliste.Rezept.Zutatenliste }
         *     
         */
        public Rezeptliste.Rezept.Zutatenliste getZutatenliste() {
            return zutatenliste;
        }

        /**
         * Legt den Wert der zutatenliste-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezeptliste.Rezept.Zutatenliste }
         *     
         */
        public void setZutatenliste(Rezeptliste.Rezept.Zutatenliste value) {
            this.zutatenliste = value;
        }

        /**
         * Ruft den Wert der zubereitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezeptliste.Rezept.Zubereitung }
         *     
         */
        public Rezeptliste.Rezept.Zubereitung getZubereitung() {
            return zubereitung;
        }

        /**
         * Legt den Wert der zubereitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezeptliste.Rezept.Zubereitung }
         *     
         */
        public void setZubereitung(Rezeptliste.Rezept.Zubereitung value) {
            this.zubereitung = value;
        }

        /**
         * Ruft den Wert der kommentarliste-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rezeptliste.Rezept.Kommentarliste }
         *     
         */
        public Rezeptliste.Rezept.Kommentarliste getKommentarliste() {
            return kommentarliste;
        }

        /**
         * Legt den Wert der kommentarliste-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rezeptliste.Rezept.Kommentarliste }
         *     
         */
        public void setKommentarliste(Rezeptliste.Rezept.Kommentarliste value) {
            this.kommentarliste = value;
        }

        /**
         * Ruft den Wert der bezeichnung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBezeichnung() {
            return bezeichnung;
        }

        /**
         * Legt den Wert der bezeichnung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBezeichnung(String value) {
            this.bezeichnung = value;
        }

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *         &lt;element name="kommentar">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/all>
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kommentar"
        })
        public static class Kommentarliste {

            protected List<Rezeptliste.Rezept.Kommentarliste.Kommentar> kommentar;

            /**
             * Gets the value of the kommentar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKommentar().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezeptliste.Rezept.Kommentarliste.Kommentar }
             * 
             * 
             */
            public List<Rezeptliste.Rezept.Kommentarliste.Kommentar> getKommentar() {
                if (kommentar == null) {
                    kommentar = new ArrayList<Rezeptliste.Rezept.Kommentarliste.Kommentar>();
                }
                return this.kommentar;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/all>
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class Kommentar {

                @XmlElement(required = true)
                protected String username;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar datum;
                @XmlElement(required = true)
                protected String text;
                @XmlAttribute(name = "id", required = true)
                protected int id;

                /**
                 * Ruft den Wert der username-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUsername() {
                    return username;
                }

                /**
                 * Legt den Wert der username-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUsername(String value) {
                    this.username = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDatum(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 */
                public int getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 */
                public void setId(int value) {
                    this.id = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *       &lt;attribute name="dauer" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="schwierigkeit" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="simpel"/>
         *             &lt;enumeration value="normal"/>
         *             &lt;enumeration value="pfiffig"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Zubereitung {

            @XmlElement(required = true)
            protected String beschreibung;
            @XmlAttribute(name = "dauer", required = true)
            protected BigInteger dauer;
            @XmlAttribute(name = "brennwert")
            protected BigInteger brennwert;
            @XmlAttribute(name = "schwierigkeit", required = true)
            protected String schwierigkeit;

            /**
             * Ruft den Wert der beschreibung-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeschreibung() {
                return beschreibung;
            }

            /**
             * Legt den Wert der beschreibung-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeschreibung(String value) {
                this.beschreibung = value;
            }

            /**
             * Ruft den Wert der dauer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDauer() {
                return dauer;
            }

            /**
             * Legt den Wert der dauer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDauer(BigInteger value) {
                this.dauer = value;
            }

            /**
             * Ruft den Wert der brennwert-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBrennwert() {
                return brennwert;
            }

            /**
             * Legt den Wert der brennwert-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBrennwert(BigInteger value) {
                this.brennwert = value;
            }

            /**
             * Ruft den Wert der schwierigkeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchwierigkeit() {
                return schwierigkeit;
            }

            /**
             * Legt den Wert der schwierigkeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchwierigkeit(String value) {
                this.schwierigkeit = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="zutat">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="zutatenname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="menge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="mengeneinheit">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="g"/>
         *                       &lt;enumeration value="l"/>
         *                       &lt;enumeration value="Tl"/>
         *                       &lt;enumeration value="El"/>
         *                       &lt;enumeration value="ml"/>
         *                       &lt;enumeration value="Bund"/>
         *                       &lt;enumeration value="Würfel"/>
         *                       &lt;enumeration value="Becher"/>
         *                       &lt;enumeration value="Pkt."/>
         *                       &lt;enumeration value="evtl."/>
         *                       &lt;enumeration value="Stück"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="anzahlPortionen" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zutat"
        })
        public static class Zutatenliste {

            @XmlElement(required = true)
            protected List<Rezeptliste.Rezept.Zutatenliste.Zutat> zutat;
            @XmlAttribute(name = "anzahlPortionen", required = true)
            protected BigInteger anzahlPortionen;

            /**
             * Gets the value of the zutat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the zutat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getZutat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rezeptliste.Rezept.Zutatenliste.Zutat }
             * 
             * 
             */
            public List<Rezeptliste.Rezept.Zutatenliste.Zutat> getZutat() {
                if (zutat == null) {
                    zutat = new ArrayList<Rezeptliste.Rezept.Zutatenliste.Zutat>();
                }
                return this.zutat;
            }

            /**
             * Ruft den Wert der anzahlPortionen-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAnzahlPortionen() {
                return anzahlPortionen;
            }

            /**
             * Legt den Wert der anzahlPortionen-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAnzahlPortionen(BigInteger value) {
                this.anzahlPortionen = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="zutatenname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="menge" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="mengeneinheit">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="g"/>
             *             &lt;enumeration value="l"/>
             *             &lt;enumeration value="Tl"/>
             *             &lt;enumeration value="El"/>
             *             &lt;enumeration value="ml"/>
             *             &lt;enumeration value="Bund"/>
             *             &lt;enumeration value="Würfel"/>
             *             &lt;enumeration value="Becher"/>
             *             &lt;enumeration value="Pkt."/>
             *             &lt;enumeration value="evtl."/>
             *             &lt;enumeration value="Stück"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Zutat {

                @XmlAttribute(name = "zutatenname")
                protected String zutatenname;
                @XmlAttribute(name = "menge")
                protected BigInteger menge;
                @XmlAttribute(name = "mengeneinheit")
                protected String mengeneinheit;

                /**
                 * Ruft den Wert der zutatenname-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZutatenname() {
                    return zutatenname;
                }

                /**
                 * Legt den Wert der zutatenname-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZutatenname(String value) {
                    this.zutatenname = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMenge(BigInteger value) {
                    this.menge = value;
                }

                /**
                 * Ruft den Wert der mengeneinheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMengeneinheit() {
                    return mengeneinheit;
                }

                /**
                 * Legt den Wert der mengeneinheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMengeneinheit(String value) {
                    this.mengeneinheit = value;
                }

            }

        }

    }

}
