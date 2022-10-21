plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

subprojects {
    apply(plugin = "java")
}

allprojects {
    group = "ru.aleksseii"
    version = "1.0-SNAPSHOT"

    dependencies {
        implementation("com.google.inject:guice:5.1.0")
        implementation("org.jetbrains:annotations:23.0.0")

        compileOnly("org.projectlombok:lombok:1.18.24")
        annotationProcessor("org.projectlombok:lombok:1.18.24")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}