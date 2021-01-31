# Maven new project archetype

## Description

Git project for Maven archetype. This archetype creates a basic new maven project which:

1. uses Java 8 as source and target language level and checks installed JDK version
1. uses `jar` packaging
1. uses UTF-8 as project encoding
1. locks down Maven plugins versions and checks installed Maven version
1. sets default goal as `clean package`
1. adds profile for checking plugin and dependency updates
1. adds dependency to the latest [log4j2][1], [JUnit 5][2] and [Mockito 3][3] and locks versions
1. copies all dependencies into `target/lib` folder
1. adds default configuration for log4j2

## Build

Build and install the archetype into the local Maven repository:

```shell
mvn clean install
```

## Usage

### Maven

```shell
mvn archetype:generate \
   -DarchetypeGroupId=ru.dkuleshov \
   -DarchetypeArtifactId=maven-newproject-archetype \
   -DarchetypeVersion=1.0
```

### IntelliJ IDEA

1. `File` - `New` - `Project...`
1. Select `Maven`
1. Check `Create from archetype`
1. Press `Add archetype...`
   1. `GroupId`: `ru.dkuleshov`
   1. `ArtifactId`: `maven-newproject-archetype`
   1. `Version`: `1.0`
1. Select new archetype in the list and press `Next` to start creating new project

[1]: https://logging.apache.org/log4j/2.x/

[2]: https://junit.org/junit5/

[3]: https://site.mockito.org/
