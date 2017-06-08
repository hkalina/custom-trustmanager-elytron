import org.kohsuke.MetaInfServices;
import javax.net.ssl.TrustManagerFactory;
import java.security.Provider;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@MetaInfServices(Provider.class)
public class MyProvider extends Provider {

    public MyProvider() {
        super("MyProvider", 1.0, "Demo provider");

        System.out.println("MyProvider initialization...");

        final List<String> emptyList = Collections.emptyList();
        final Map<String, String> emptyMap = Collections.emptyMap();

        putService(new Service(this, TrustManagerFactory.class.getSimpleName(),"MyAlgorithm", MyTrustManagerFactorySpi.class.getName(), emptyList, emptyMap));
    }

}
