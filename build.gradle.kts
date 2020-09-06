plugins {
    java
    kotlin("jvm") version "1.4.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.apache.commons", "commons-lang3", "3.0")
    implementation("com.google.guava:guava:29.0-jre")
    implementation("org.apache.commons", "commons-collections4", "4.0")
    testCompile("junit", "junit", "4.12")

    compileOnly("org.projectlombok", "lombok", "1.18.12")
    annotationProcessor("org.projectlombok", "lombok", "1.18.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}