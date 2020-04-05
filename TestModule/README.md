# DBMS testing framework

For running testing framework on Linux systems use ```run.sh``` script in project root folder:

```bash
./run.sh build
./run.sh test
```
It will create a config file ```~/.dbms_tests_config```
Please, check the path to the root directory with the tests in the configuration file. By default, the path should point to ```$PROJECT_ROOT/TestModule/tests/```

To main function (class Main.java) MUST be passed 1 argument: full path to projects root directory (script run.sh will do it automatically)

If you want to run certain tests and get the result (only true or false), you can use the special syntax:
```bash
./run.sh test run testname1, testname2 ...
./run.sh test run all
```

TODO: Script for Windows

## Tests structure

Example of test folder:
```
TestFolder
    expected
        hello.expected
        world.expected
    results
        hello.codes
        hello.out
        world.codes
        world.out
    hello.in
    world.in
```

The ```TestFolder``` folder contains a test whose name matches the name of the folder.

Files with the extension **.in** are test files with SQL queries and commands for the testing framework. 
In the example above, there are two tests called ```hello``` and ```world```.

The ```expected``` folder contains the expected output for each test 
in files with the extension **.expected**. The output should match exactly what you want, including white space and line breaks. 
In the example above, there are two files with the expected output for each test: ```hello.expected``` and ```world.expected```.

The ```results``` folder contains valid tests results. Files with the extension **.out** store the received output, which will then be compared with the corresponding **.expected** file. Files with the extension **.codes** contain operation codes, executable commands and their output in json format.


The test framework will automatically create the necessary folders and files using the *create* command.

## Command line interface

### ```run``` command
Run test or list of tests for executing. You can write ```run all``` for running all available tests from tests root folder. 

Examples:
```
run testname
run testname1 testname2
run all
```

### ```ls``` command
Aliases: ```list```, ```lst```, ```dir```

List available tests in tests root folder

### ```create``` command
Aliases: ```new```

Create new folder with test. Takes the name of the test or a list of names as an argument.

Examples:
```
create testname
new testname
create testname1 testname2
```

### ```delete``` command
Aliases: ```remove```, ```del```, ```rm```

Removes folder with test. Takes the name of the test or a list of names as an argument.

Examples:
```
rm testname
delete testname
del testname1 testname2
```

### ```clear``` command
Aliases: ```cls```

Clears the screen of terminal. Not all of terminals are supported. Check if your terminal supports ANSI escape codes.

### ```exit``` command
Aliases: ```quit```

Exit from testing framework

## Test framework commands

You can use these commands inside tests (**.in** files).

### [@Clear]

Clear the database (deletes the folder with the current database and re-creates it).

### [@PrintLevel MAIN|EXTENDED|NONE]
Default value: MAIN

Sets the level of the desired output. For printing complete testing progress, use EXTENDED. To get only the test result (no error output) use NONE.

### @@ Some Text
Comment. Just a comment.