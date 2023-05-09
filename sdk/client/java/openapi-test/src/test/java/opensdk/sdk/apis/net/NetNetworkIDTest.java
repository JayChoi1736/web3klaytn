package opensdk.sdk.apis.net;

import opensdk.sdk.apis.constant.UrlConstants;
import opensdk.sdk.models.NetNetworkIDResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.klaytn.OpenSDK;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Eth RPC Test")

public class NetNetworkIDTest {
    private final OpenSDK sdk = new OpenSDK(UrlConstants.SERVER_URL);

    @Test
    @DisplayName("RPC net_networkID")
    void whenRequestValid_ThenCall200ResponseReturns() throws IOException {
        NetNetworkIDResponse response = sdk.net.networkID().send();
        assertNotNull(response);
        assertNull(response.getError());
    }
}
