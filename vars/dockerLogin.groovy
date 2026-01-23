#!/user/bin/env groovy
import com.example.Docker

def call(String credentialsId) {
    echo "Starting Docker login using credentialsId=${credentialsId}"
    new Docker(this).dockerLogin(credentialsId)
}