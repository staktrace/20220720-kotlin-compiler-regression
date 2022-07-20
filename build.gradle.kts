buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    }
}

subprojects {
    buildscript {
        repositories {
            mavenCentral()
        }
    }
    repositories {
        mavenCentral()
    }
}
