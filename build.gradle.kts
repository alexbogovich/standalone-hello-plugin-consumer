import com.github.alexbogovich.plugin.greeting.GreetingTask

buildscript {
    repositories {
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath("com.github.alexbogovich:standalone-hello-plugin:1.0-SNAPSHOT")
    }
}

plugins {
    java
//    id("com.github.alexbogovich.hello-plugin") version "1.0-SNAPSHOT"
}

apply(plugin = "com.github.alexbogovich.hello-plugin")

repositories {
    jcenter()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

group   = "com.github.alexbogovich"
version = "1.0-SNAPSHOT"

task(name = "greetingAlex", type = GreetingTask::class) {
    who = "Alex"
}