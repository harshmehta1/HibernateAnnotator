# HibernateAnnotator
Adds annotation to classes created by JsonSchema2Pojo library

Specifically developed for https://github.com/harshmehta1/auto-java-app-generator

## How to use

* Generate a jar of the project.
* Import this jar as a library in your project.
* In the SchemaMapper variable, use HibernateAnnotator instead of the Jackson Annotator.

For example:

`SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, **new HibernateAnnotator()**, new SchemaStore()), new SchemaGenerator());`

## Generating a jar

To generate a jar of the project:

* Open command prompt and go into the project folder
* Run `javac *.java`
* Run `jar cvfe HibernateAnnotator.jar HibernateAnnotator *.class`
