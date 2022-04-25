package com.github.dragonslacky.githubdarkertheme.services

import com.intellij.openapi.project.Project
import com.github.dragonslacky.githubdarkertheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
