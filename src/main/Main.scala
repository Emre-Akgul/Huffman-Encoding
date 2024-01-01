package patmat

object Main extends App {
  // Directly access the secret and frenchCode from the Huffman object
  val secret: List[Int] = Huffman.secret
  val frenchCode: CodeTree = Huffman.frenchCode

  // Decode the secret message using the decode method from the Huffman object
  val decodedMessage: List[Char] = Huffman.decode(frenchCode, secret)

  // Print the decoded message
  println(decodedMessage.mkString)
  println("Emre Akgül")
}