import java.io.File

// clients
//in the end classes should not be forced to implement function/interface they actually no need


interface FileLogger2 {

    fun printLogs() { // make default so other classes it should not force until its needed
    }

    fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(text = error)
    }
}


class CustomErrorFileLogger2 : FileLogger2 {

//    override fun printLogs() { if needed we can override
//
//    }


    override fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(text = error)
    }
}
