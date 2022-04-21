package oo

class Article(val title: String, val author: String, val publicationYear: Int, var price: Double) {
    override fun toString(): String {
        return "Article[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataArticle(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main() {
    // see the difference between a normal class and a data class in terms of the toString()
    // without overriding the toString(), the output of 'println(article)' will be 'oo.Article@fhaknf'
    val article = Article("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    val dataArticle = DataArticle("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    println(article)
    println(dataArticle)

    // in a data class, hashSet only print out the elements which are different, the identical elements will only be print out once
    println("-----------------------------------------------")
    val article1 = Article("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    val dataArticle1 = DataArticle("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    val set = hashSetOf(article, article1)
    val dataSet = hashSetOf(dataArticle, dataArticle1)
    println(set)
    println(dataSet)

    // simply use the copy() method to duplicate a exiting object and set properties if needed
    println("-----------------------------------------------")
    val dataArticle2 = dataArticle.copy(price = 188.88)
    println(dataArticle2)

    //creating val by decomposing properties of object
    println("-----------------------------------------------")
    val (title, author, publicationYear, price) = dataArticle
    println(title)
    println(publicationYear)

    // differences in terms of the equals() method
    println("-----------------------------------------------")
    val article3 = Article("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    val dataArticle3 = DataArticle("How to write your first line of code?", "Yaner Lu", 1997, 0.01)
    println(article3.equals(article))
    println(dataArticle3.equals(dataArticle))
}
