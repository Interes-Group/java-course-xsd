# XSD schema and JAXB
![License MIT](https://img.shields.io/badge/License-MIT-green)
![Java 1.8](https://img.shields.io/badge/Java-1.8-blue)

Cieľom projektu je demonštrovať prácu s XSD schémou pre XML súbory.
Použitie vytvorenej schémy v XML súbore a následné spracovanie 
pomocou knižnice JAXB pre použitie v aplikácii.

Vygenerované triedy sú umiestnené v `target/generated-sources/java/`

Viac informácií o JAXB [baeldung.com](https://www.baeldung.com/jaxb).

## Vygenerovanie tried
Pre vygenerovanie tried pomocou JAXB Maven plugin
```
mvn clean compile
```

## Build
Pre kompilovanie aplikácie
```
mvn clean package
```

## Run
Pre spustenie aplikácie po vygenerovaní tried
```
java -jar target/xsd_jaxb-1.0.jar
```