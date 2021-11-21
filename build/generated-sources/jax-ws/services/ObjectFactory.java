
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _CalRound_QNAME = new QName("http://services/", "calRound");
    private final static QName _CalRoundResponse_QNAME = new QName("http://services/", "calRoundResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalRound }
     * 
     */
    public CalRound createCalRound() {
        return new CalRound();
    }

    /**
     * Create an instance of {@link CalRoundResponse }
     * 
     */
    public CalRoundResponse createCalRoundResponse() {
        return new CalRoundResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalRound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalRound }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "calRound")
    public JAXBElement<CalRound> createCalRound(CalRound value) {
        return new JAXBElement<CalRound>(_CalRound_QNAME, CalRound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalRoundResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalRoundResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "calRoundResponse")
    public JAXBElement<CalRoundResponse> createCalRoundResponse(CalRoundResponse value) {
        return new JAXBElement<CalRoundResponse>(_CalRoundResponse_QNAME, CalRoundResponse.class, null, value);
    }

}
