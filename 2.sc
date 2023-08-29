object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalLetterCount = wordLengths.reduce((total, length) => total + length)
    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalLetterCount = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalLetterCount")
  }
}
