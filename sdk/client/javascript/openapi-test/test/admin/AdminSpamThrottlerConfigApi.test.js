const OpenSdk = require("opensdk-javascript");
const { expect } = require("@jest/globals");
const { RPC } = require("../constant");

const sdk = new OpenSdk(new OpenSdk.ApiClient(RPC));

describe('admin_spamThrottlerConfig API', () => {
    test('should return admin_spamThrottlerConfig', (done) => {

        let callbackOne = function (error, data, response) {
            expect(error).toBeNull();
            expect(data).toBeDefined()
            done();
        };
        // TODO check spam throttler in advance.
        sdk.admin.spamThrottlerConfig({}, callbackOne);
    });
});
