#!/user/bin/env groovy
import com.example.Docker

def call() {
    echo "building the application for branch $GIT_BRANCH"
    sh 'mvn package'
}