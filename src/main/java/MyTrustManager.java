import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class MyTrustManager extends X509ExtendedTrustManager {

    public void checkClientTrusted(X509Certificate[] x509Certificates, String s, Socket socket) throws CertificateException {
        System.out.println("MyTrustManager: checkClientTrusted");
    }

    public void checkServerTrusted(X509Certificate[] x509Certificates, String s, Socket socket) throws CertificateException {
        System.out.println("MyTrustManager: checkServerTrusted");
    }

    public void checkClientTrusted(X509Certificate[] x509Certificates, String s, SSLEngine sslEngine) throws CertificateException {
        System.out.println("MyTrustManager: checkClientTrusted");
    }

    public void checkServerTrusted(X509Certificate[] x509Certificates, String s, SSLEngine sslEngine) throws CertificateException {
        System.out.println("MyTrustManager: checkServerTrusted");
    }

    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        System.out.println("MyTrustManager: checkClientTrusted");
    }

    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        System.out.println("MyTrustManager: checkServerTrusted");
    }

    public X509Certificate[] getAcceptedIssuers() {
        System.out.println("MyTrustManager: getAcceptedIssuers");
        return new X509Certificate[0];
    }

}
