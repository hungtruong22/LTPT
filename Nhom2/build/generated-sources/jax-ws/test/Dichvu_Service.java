
package test;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Dichvu", targetNamespace = "http://Test/", wsdlLocation = "http://localhost:8080/WSNhom2/Dichvu?wsdl")
public class Dichvu_Service
    extends Service
{

    private final static URL DICHVU_WSDL_LOCATION;
    private final static WebServiceException DICHVU_EXCEPTION;
    private final static QName DICHVU_QNAME = new QName("http://Test/", "Dichvu");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSNhom2/Dichvu?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DICHVU_WSDL_LOCATION = url;
        DICHVU_EXCEPTION = e;
    }

    public Dichvu_Service() {
        super(__getWsdlLocation(), DICHVU_QNAME);
    }

    public Dichvu_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DICHVU_QNAME, features);
    }

    public Dichvu_Service(URL wsdlLocation) {
        super(wsdlLocation, DICHVU_QNAME);
    }

    public Dichvu_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DICHVU_QNAME, features);
    }

    public Dichvu_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Dichvu_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Dichvu
     */
    @WebEndpoint(name = "DichvuPort")
    public Dichvu getDichvuPort() {
        return super.getPort(new QName("http://Test/", "DichvuPort"), Dichvu.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Dichvu
     */
    @WebEndpoint(name = "DichvuPort")
    public Dichvu getDichvuPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Test/", "DichvuPort"), Dichvu.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DICHVU_EXCEPTION!= null) {
            throw DICHVU_EXCEPTION;
        }
        return DICHVU_WSDL_LOCATION;
    }

}