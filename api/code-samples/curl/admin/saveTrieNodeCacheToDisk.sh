curl -X 'POST' \
  'https://api.baobab.klaytn.net:8651/admin/saveTrieNodeCacheToDisk' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "method": "admin_saveTrieNodeCacheToDisk",
  "id": 1,
  "jsonrpc": "2.0"
}'
