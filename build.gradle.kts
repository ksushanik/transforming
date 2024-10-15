plugins {
    kotlin("jvm") version "1.5.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

sourceSets {
    main {
        kotlin.srcDirs("src")
    }
}

application {
    mainClassName = "MainKt"
}