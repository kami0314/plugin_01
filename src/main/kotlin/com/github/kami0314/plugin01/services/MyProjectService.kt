package com.github.kami0314.plugin01.services

import com.github.kami0314.plugin01.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
