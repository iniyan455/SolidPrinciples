//  This function voliates first principles of solid Single Responsibility -> Reason to change.
//  What ever class you have or whatever function you have this functions and class
//  should always have one single responsibility and one reason to change

class SRP(private val auth: String, private val fileLogger: FileLogger) {
    suspend fun loginUser(email: String, password: String) {
        try {
            // happy flow
        } catch (e: java.lang.Exception) {
            fileLogger.logError(error = e.message.toString())
        }
    }
}