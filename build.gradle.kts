buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.7.0"       // FAILS BUILD
    // kotlin("jvm") version "1.6.21"       // BUILD SUCCEEDS
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
      "-Xextended-compiler-checks"
    )
    kotlinOptions.jvmTarget = "11"
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
