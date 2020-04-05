#!/usr/bin/bash

SCRIPT_DIR=$(dirname "$0")
TESTS_CONFIG="$HOME/.dbms_tests_config"
TESTS_MODULE_EXECUTABLE="./TestModule/target/Test-1.0.0-jar-with-dependencies.jar"

cd "$SCRIPT_DIR" || exit 1

if [[ ! -f $TESTS_CONFIG ]]
then
    echo "Creating configuration file"
    echo "TEST_FOLDER=$(pwd)/tests/" > "$TESTS_CONFIG"
fi

if [ ! -x "$(command -v mvn)" ]
then
    echo "Maven if not installed. Aborting..."
    exit 0
fi

mvn clean install

java -jar $TESTS_MODULE_EXECUTABLE "$(pwd)"/
