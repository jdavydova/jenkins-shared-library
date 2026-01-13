#!/user/bin/env groovy
import com.example.Docker

def call(String credentialsId) {
    new Docker(this).dockerLogin(credentialsId)
}