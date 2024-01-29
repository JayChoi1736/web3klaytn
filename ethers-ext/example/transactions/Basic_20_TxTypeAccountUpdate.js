// TxTypeAccountUpdate
// https://docs.klaytn.foundation/docs/learn/transactions/

const ethers = require("ethers");

const { Wallet, TxType, AccountKeyType } = require("@klaytn/ethers-ext");

// Using senderPriv == senderNewPriv to execute this example repeatedly.
// But you might want to register a different private key.
const senderAddr = "0xe15cd70a41dfb05e7214004d7d054801b2a2f06b";
const senderPriv = "0x0e4ca6d38096ad99324de0dde108587e5d7c600165ae4cd6c2462c597458c2b8";
const senderNewPriv = "0x0e4ca6d38096ad99324de0dde108587e5d7c600165ae4cd6c2462c597458c2b8";

const provider = new ethers.providers.JsonRpcProvider("https://archive-en.baobab.klaytn.net");
const wallet = new Wallet(senderAddr, senderPriv, provider); // decoupled account

async function main() {
  const pub = ethers.utils.computePublicKey(senderNewPriv, true);
  console.log("pub", pub);

  const tx = {
    type: TxType.AccountUpdate,
    from: senderAddr,
    key: {
      type: AccountKeyType.Public,
      key: pub,
    }
  };

  const sentTx = await wallet.sendTransaction(tx);
  console.log("sentTx", sentTx.hash);

  const receipt = await sentTx.wait();
  console.log("receipt", receipt);
}

main();
