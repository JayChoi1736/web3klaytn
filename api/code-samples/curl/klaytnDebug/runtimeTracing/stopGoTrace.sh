curl -X 'POST' \
  'https://public-en-cypress.klaytn.net/debug/stopGoTrace' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "method": "debug_stopGoTrace",
  "id": 1,
  "jsonrpc": "2.0",
  "params": []
}'
