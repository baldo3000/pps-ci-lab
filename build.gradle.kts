plugins {
    java
    application
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.8.3"
    val scalaTest = "3.2.20"
    val jUnit = "6.0.3"
    implementation("org.scala-lang:scala3-library_3:$scalaVersion")

    testImplementation("org.scalatest:scalatest_3:$scalaTest")
    testImplementation(platform("org.junit:junit-bom:$jUnit"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.withType<ScalaCompile>().configureEach {
    scalaCompileOptions.additionalParameters = listOf(
        "-Xunchecked-java-output-version",
        JavaVersion.current().majorVersion
    )
}

tasks.withType<AbstractCopyTask>().configureEach {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
