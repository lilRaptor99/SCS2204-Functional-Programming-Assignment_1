object CaesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val encryptChar = (c: Char, alphabet: String, shift: Int) => {
    alphabet(
      (alphabet.indexOf(c) + shift) % alphabet.size
    );
  };

  val decryptChar = (c: Char, alphabet: String, shift: Int) => {
    alphabet(
      (alphabet.indexOf(c) - shift + alphabet.size) % alphabet.size
    );
  };

  val cipher = (
      text: String,
      cipherAlgo: (Char, String, Int) => Char,
      alphabet: String,
      shift: Int
  ) => {
    new String(
      text
        .toUpperCase()
        .toCharArray()
        .map(x => cipherAlgo(x, alphabet, shift))
        .toArray
    )
  }

  val msg = "ABCDXYZ";
  val shift = 1;

  val encryptedMsg = cipher(msg, encryptChar, alphabet, shift);
  val decryptedMsg = cipher(encryptedMsg, decryptChar, alphabet, shift);

  println("Original Message: " + msg);
  println("Encrypted Message: " + encryptedMsg);
  println("Decrypted Message: " + decryptedMsg);
}
