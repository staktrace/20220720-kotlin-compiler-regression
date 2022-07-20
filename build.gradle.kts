buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.7.0"
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-kotlin:3.19.2")
}

tasks{
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf(
      "-opt-in=kotlin.RequiresOptIn",
      "-opt-in=com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode",
      "-Xlint:-deprecation"
    )
  }
}

sourceSets {
  main {
    java {
      srcDirs("src/main/java")
      srcDirs("src/main/kotlin")
    }
  }
}
