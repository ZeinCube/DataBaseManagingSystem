#!/usr/bin/bash

SCRIPT_DIR=$(dirname "$0")
TESTS_MODULE_EXECUTABLE="./TestModule/target/Test-1.0.0-jar-with-dependencies.jar"
CONSOLE_MODULE_EXECUTABLE="./ConsoleModule/target/Console-1.0.0-jar-with-dependencies.jar"

function build {
  if [ ! -x "$(command -v java)" ]; then
    echo "Java is not installed. Aborting..."
    exit 0
  fi

  if [ ! -x "$(command -v mvn)" ]; then
    echo "Maven if not installed. Aborting..."
    exit 0
  fi

  mvn clean install
}

function run_testing_framework {
  TESTS_CONFIG="$HOME/.dbms_tests_config"

  if [[ ! -f $TESTS_CONFIG ]]; then
    echo "Creating configuration file"
    echo "TEST_FOLDER=$(pwd)/tests/" > "$TESTS_CONFIG"
  fi

  java -jar $TESTS_MODULE_EXECUTABLE "$(pwd)"/
}

function run_console {
  java -jar $CONSOLE_MODULE_EXECUTABLE
}


cd "$SCRIPT_DIR" || exit 0

if [ "$#" -ne 1 ]; then
  run_console
else
  case $1 in
    "build") build;;
    "test") run_testing_framework;;
    "console") run_console;;
  esac
fi
