curl -X 'POST' \
  'http://localhost:8551' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "method": "eth_getBlockByNumber",
  "id": 83,
  "jsonrpc": "2.0",
  "params": ["0xd0054e", false]
}'