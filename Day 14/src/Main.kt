fun main(args: Array<String>) {
    val title = readLine()!!.toString()
    val author = readLine()!!.toString()
    val price = readLine()!!.toInt()

    val myBook = MyBook(title, author, price)
    myBook.display()
}

abstract class Book(var title: String, var author: String) {
    abstract fun display()
}

class MyBook(title: String, author: String, var price: Int): Book(title, author) {

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        print("Price: $price")
    }

}