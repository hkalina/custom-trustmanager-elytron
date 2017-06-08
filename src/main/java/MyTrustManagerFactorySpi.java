import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;

public class MyTrustManagerFactorySpi extends TrustManagerFactorySpi {

    protected void engineInit(KeyStore keyStore) throws KeyStoreException {

    }

    protected void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {

    }

    protected TrustManager[] engineGetTrustManagers() {
        return new TrustManager[]{ new MyTrustManager() };
    }

}
