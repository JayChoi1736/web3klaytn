from opensdk.sdk import OpenSDK

host = "https://api.baobab.klaytn.net:8651"

sdk = OpenSDK(host)
debug_response = sdk.debug.stop_go_trace()

print(debug_response)