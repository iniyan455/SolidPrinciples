import java.io.File

// Open & closed principle -> object for extension and close for modification

open class FileLogger {
    open  fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(text = error)
    }
}


class CustomErrorFileLogger : FileLogger() {
    override fun logError(error: String) {
        val file = File("my_custom_error_file.txt")
        file.appendText(text = error)
    }
}


//
//Single Responsibility Principle (SRP)
//Open-Closed Principle (OCP)
//Liskov Substitution Principle (LSP)
//Interface Segregation Principle (ISP)
//Dependency Inversion Principle (DIP)