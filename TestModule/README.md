# DBMS testing framework

For running testing framework on Linux systems use ```run.sh``` script in project root folder:

```bash
./run.sh build
./run.sh test
```
It will create a config file ```~/.dbms_tests_config```
Please, check the path to the root directory with the tests in the configuration file. By default, the path should point to ```$PROJECT_ROOT/TestModule/tests/```

TODO: Script for Windows

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
