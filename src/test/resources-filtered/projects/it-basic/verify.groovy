import java.nio.file.Files

def basicProjectTargetDir = '${project.build.testOutputDirectory}\\projects\\it-basic\\project\\basic-project\\target'

if (Files.notExists(new File("${basicProjectTargetDir}\\basic-project-0.1-SNAPSHOT.jar").toPath())) {
    throw new FileNotFoundException('Project jar is not found')
}

if (Files.notExists(new File("${basicProjectTargetDir}\\basic-project-0.1-SNAPSHOT-sources.jar").toPath())) {
    throw new FileNotFoundException('Project sources jar is not found')
}

if (Files.notExists(new File("${basicProjectTargetDir}\\log4j2.xml").toPath())) {
    throw new FileNotFoundException('Log configuration file is not found')
}

if (Files.notExists(new File("${basicProjectTargetDir}\\lib\\log4j-api-2.14.0.jar").toPath())
    || Files.notExists(new File("${basicProjectTargetDir}\\lib\\log4j-core-2.14.0.jar").toPath()))
{
    throw new FileNotFoundException('Log4j library is not found')
}