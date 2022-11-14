interface Authenticator {
    suspend fun signInWithEmailAndPassword(email: String, password: String)
}


class FirebaseAuthenticator: Authenticator {
    override suspend fun signInWithEmailAndPassword(email: String, password: String) {
      // FirebaseAuth.getInstance().SignInWithEmailAndPassword(email,password)
    }
}


class CustomApiAuthenticator : Authenticator {
    override suspend fun signInWithEmailAndPassword(email: String, password: String) {
        // Retrofit api call
    }
}