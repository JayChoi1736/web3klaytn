package opensdk.sdk.apis.klay.account;

import opensdk.sdk.apis.constant.UrlConstants;
import opensdk.sdk.models.KlayGetAccountResponse;
import org.klaytn.OpenSDK;

import java.io.IOException;

public class KlayGetAccountExample {

    private final OpenSDK sdk = new OpenSDK(UrlConstants.TEST_URL);

    void klayGetAccountExample() throws IOException {
        KlayGetAccountResponse ar = sdk.klay.getAccount(
            "0x1cbd3b2770909d4e10f157cabc84c7264073c9ec",
            "latest")
        .send();
        ar.getResult();
    }
}
