
package servicesclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicesclient package. 
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

    private final static QName _CalArea_QNAME = new QName("http://services/", "calArea");
    private final static QName _CalAreaResponse_QNAME = new QName("http://services/", "calAreaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicesclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalArea }
     * 
     */
    public CalArea createCalArea() {
        return new CalArea();
    }

    /**
     * Create an instance of {@link CalAreaResponse }
     * 
     */
    public CalAreaResponse createCalAreaResponse() {
        return new CalAreaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "calArea")
    public JAXBElement<CalArea> createCalArea(CalArea value) {
        return new JAXBElement<CalArea>(_CalArea_QNAME, CalArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "calAreaResponse")
    public JAXBElement<CalAreaResponse> createCalAreaResponse(CalAreaResponse value) {
        return new JAXBElement<CalAreaResponse>(_CalAreaResponse_QNAME, CalAreaResponse.class, null, value);
    }

}
