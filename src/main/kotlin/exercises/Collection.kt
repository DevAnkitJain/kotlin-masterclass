package exercises

/*
*
* You need to filter the short words based on given length and remove the basic articles from the final result.
* Also make sure no words repeat twice in the result.
*
 */
fun main() {
    val words = "We are learning Kotlin master class in the training room and We will make sure our team wins this round".split(" ")
    val articles = setOf("a", "A", "an", "An", "the", "The")
    val minLength = 4
    val result = shortNonRepeatingWords(words, articles, minLength)

    println(result)
    println(result.size)
}

fun shortNonRepeatingWords(words: List<String>, articles: Set<String>, minLength: Int): Set<String> {
// Implement Here
    return emptySet()
}
