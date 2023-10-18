# avro-tools
Repository to manage avro schema and tools for kafka streaming application or microservices

## Introduction
This repository contains all avro schema tools to manage and use Event from Kafka Cluster

### Technical Stack

[Java 17](https://openjdk.org/projects/jdk/17/)

### Built With

![Apache Maven](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Maven&color=C71A36&logo=Apache+Maven&logoColor=FFFFFF&label=)
![Apache Kafka](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Kafka&color=231F20&logo=Apache+Kafka&logoColor=FFFFFF&label=)

### Installation

To use these tools in your microservice use the following Maven Dependency from the github maven repository

```
<!-- add GitHub avro-tools dependency -->
<dependency>
  <groupId>fr.mattkds</groupId>
  <artifactId>avro-tools</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

To download this dependency maven has to be authorized by github registry to download packages, to do this you have to edit the settings.xml file of your project as follows :
[How to use package registry with maven](https://docs.github.com/fr/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry)

### Usage

Once the avro-tools is available in your project, you just have to import your generated classes from the dependency avro-tools for example :

```java
    import fr.mattkds.avro.event.v2.Order;
    
    public class OrderService {
        Order order = new Order();
    }
```

### Schema references

| Object | package                        | version |
|--------|--------------------------------|---------|
| Order  | fr.mattkds.avro.event.v1.Order | 1       |
| Order  | fr.mattkds.avro.event.v2.Order | 2       |

### Maven commands
In avro-tools project, you can generate the sources by using the following commands.
This command will call the avro-maven-plugin declared in the pom.xml file to generate the classes from avsc files in the /avro folder
```bash
   mvn clean generate-sources
```