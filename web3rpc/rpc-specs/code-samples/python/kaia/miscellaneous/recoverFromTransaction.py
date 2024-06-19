from web3 import Web3
from web3py_ext import extend

host = "https://api.baobab.klaytn.net:8651"

rlpEncoded = '0x08f88608850ba43b7400827b0c94c40b6909eb7085590e1c26cb3becc25368e249e9880de0b6b3a764000094e15cd70a41dfb05e7214004d7d054801b2a2f06bf847f845820fe9a090421871e8fd77e08b6a72760006a15184a96cfc39c7486ea948d11fd830ae8aa05876248aa8dc0783d782e584e6f8d9bf977c698210a0eab3e754192d0954de65'
blockNumber = 'latest'

w3 = Web3(Web3.HTTPProvider(host))
kaia_response = w3.kaia.recover_from_transaction(rlpEncoded, blockNumber)

print(kaia_response)
