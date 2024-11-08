
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _Hello_QNAME = new QName("http://Test/", "hello");
    private final static QName _Tich_QNAME = new QName("http://Test/", "Tich");
    private final static QName _GetNVResponse_QNAME = new QName("http://Test/", "getNVResponse");
    private final static QName _TichResponse_QNAME = new QName("http://Test/", "TichResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://Test/", "helloResponse");
    private final static QName _GetNV_QNAME = new QName("http://Test/", "getNV");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNVResponse }
     * 
     */
    public GetNVResponse createGetNVResponse() {
        return new GetNVResponse();
    }

    /**
     * Create an instance of {@link GetNV }
     * 
     */
    public GetNV createGetNV() {
        return new GetNV();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TichResponse }
     * 
     */
    public TichResponse createTichResponse() {
        return new TichResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Tich }
     * 
     */
    public Tich createTich() {
        return new Tich();
    }

    /**
     * Create an instance of {@link Nhanvienbean }
     * 
     */
    public Nhanvienbean createNhanvienbean() {
        return new Nhanvienbean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tich }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "Tich")
    public JAXBElement<Tich> createTich(Tich value) {
        return new JAXBElement<Tich>(_Tich_QNAME, Tich.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getNVResponse")
    public JAXBElement<GetNVResponse> createGetNVResponse(GetNVResponse value) {
        return new JAXBElement<GetNVResponse>(_GetNVResponse_QNAME, GetNVResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TichResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "TichResponse")
    public JAXBElement<TichResponse> createTichResponse(TichResponse value) {
        return new JAXBElement<TichResponse>(_TichResponse_QNAME, TichResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Test/", name = "getNV")
    public JAXBElement<GetNV> createGetNV(GetNV value) {
        return new JAXBElement<GetNV>(_GetNV_QNAME, GetNV.class, null, value);
    }

}
