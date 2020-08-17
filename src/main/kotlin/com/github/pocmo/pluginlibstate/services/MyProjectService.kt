package com.github.pocmo.pluginlibstate.services

import com.intellij.openapi.project.Project
import com.github.pocmo.pluginlibstate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
