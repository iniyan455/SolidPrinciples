//Dependency Inversion We should depend on abstractions and not on concrete ( Firebase) interface is abstract

class DIP(private val auth: Authenticator, private val fileLogger: FileLogger) {
    suspend fun loginUser(email: String, password: String) {
        try {
            // happy flow
            auth.signInWithEmailAndPassword("iniyan","iniyan")
        } catch (e: java.lang.Exception) {
            fileLogger.logError(error = e.message.toString())
        }
    }
}