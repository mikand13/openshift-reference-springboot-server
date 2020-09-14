plugins {
    id("idea")
    id("java")
    id("no.skatteetaten.gradle.aurora") version("4.0.0rc1")
}

aurora {
    useAuroraDefaults

    versions {
        javaSourceCompatibility = "1.11"
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jdbc:2.3.3.RELEASE")
    implementation("com.oracle.database.jdbc:ojdbc8:12.2.0.1")
}