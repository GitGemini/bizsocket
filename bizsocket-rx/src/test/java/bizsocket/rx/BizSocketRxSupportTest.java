package bizsocket.rx;

import bizsocket.core.Configuration;
import client.SampleSocketClient;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by tong on 16/10/8.
 */
public class BizSocketRxSupportTest extends TestCase {
    @Test
    public void testCreate1() throws Exception {
        SampleSocketClient client = new SampleSocketClient(new Configuration.Builder()
                .host("127.0.0.1")
                .port(9103)
                .build());

        BizSocketRxSupport rxBizSocke = new BizSocketRxSupport.Builder()
                .bizSocket(client)
                .requestConverter(new JSONRequestConverter())
                .responseConverter(new JSONResponseConverter())
                .build();
    }
}
