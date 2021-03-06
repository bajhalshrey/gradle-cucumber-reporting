package com.github.spacialcircumstances.gradle

import org.gradle.api.file.ConfigurableFileCollection

class ReportsPluginExtension {
    File outputDir
    String buildName
    ConfigurableFileCollection reports
    Boolean parallelTesting = false
    Boolean runWithJenkins = false
    Boolean testTasksFinalizedByReport = true
    Map<String, String> classifications = new HashMap<>()
}
