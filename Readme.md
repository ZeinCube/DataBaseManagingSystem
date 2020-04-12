# DataBaseManagingSystem Project

![](https://github.com/ZeinCube/DataBaseManagingSystem/workflows/DBMS%20workflow/badge.svg)
![](https://runkit.io/rubbaboy/byob/branches/master/ZeinCube/DataBaseManagingSystem/build_status)
![](https://runkit.io/rubbaboy/byob/branches/master/ZeinCube/DataBaseManagingSystem/test_status)

Contributors :
* [Anton Melnikov](https://github.com/hehogcode)
* [Ivan Kokorev](https://github.com/ZeinCube)

## Initialization of parser
For Intellij IDEA

Configure ANTRL... with settings:

- Output directory where all output is generated: ...DataBase/LogicModule/src/main/java/

- Location of imported grammars: ...DataBase/LogicModule/src/main/java/
- Package/namespace for the generated code: Logic.Parser

## Dependencies
To run project you need JDK8 and maven installed

- Install on Ubuntu (tested on Ubuntu 19.10)
```bash
sudo apt install openjdk-8-jdk maven -y
sudo update-java-alternatives --set java-1.8.0-openjdk-amd64
```
    
- Install on fedora

## ```Run.sh``` script
For linux users only.

- Build project:
```bash
./run.sh build
```

- Run testing framework:

(read [Testing framework readme](TestModule/README.md))
```bash
./run.sh test
```

- Run dbms console
```bash
./run.sh console

# or just

./run.sh
```