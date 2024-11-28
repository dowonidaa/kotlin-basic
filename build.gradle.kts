plugins {
  kotlin("jvm") version "2.0.21"
  id("org.jlleitschuh.gradle.ktlint") version "11.3.2"
  application
}

group = "hello"
version = "0.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(17)
}
