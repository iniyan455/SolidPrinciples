import java.io.File

//Parent class should be replaceable by their sub classes that without alter the behaviour of parent class
open class FileLogger1 {
    open  fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(text = error)
    }
}


class CustomErrorFileLogger1 : FileLogger1() {

    // we should not use like this parent class will not override sub class anymore
//    fun customError(error: String) {
//        val file = File("my_custom_error_file.txt")
//        file.appendText(text = error)
//    }

    override fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(text = error)
    }
}


//Single Responsibility Principle (SRP)
//Open-Closed Principle (OCP)
//Liskov Substitution Principle (LSP)
//Interface Segregation Principle (ISP)
//Dependency Inversion Principle (DIP)