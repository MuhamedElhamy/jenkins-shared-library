#!/usr/bin/env groovy

def call() {
    echo "building the application from branch $BRANCH_NAME"
    sh 'mvn package'
}
