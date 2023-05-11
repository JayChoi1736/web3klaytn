package opensdk.sdk.apis.klaytnDebug.others;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import opensdk.sdk.apis.constant.UrlConstants;
import opensdk.sdk.models.DebugStorageRangeAtResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.klaytn.OpenSDK;
@DisplayName("Debug RPC Test")
public class DebugStorageRangeAtTest {
  private final OpenSDK sdk = new OpenSDK(UrlConstants.SERVER_URL);
  @Disabled
  @Test
  @DisplayName("RPC debug_storageRangeAt")
  void whenRequestValid_ThenCall200ResponseReturns() throws IOException {
    String blockHash = "0x90c81195698bc9f282bbdec386b0afb4dcc28e43aae834894281c3ecb3c88d21";
    int txIndex = 1;
    String contractAddress = "0x73a7d19d14f7dfac5b799e405e22133b2adc57a6";
    String keyStart = "0x12";
    int maxResult = 1;

    DebugStorageRangeAtResponse response = sdk.debug.storageRangeAt(blockHash, txIndex, contractAddress, keyStart, maxResult).send();
    assertNotNull(response);
    assertNull(response.getError());
  }
}
