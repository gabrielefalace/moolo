package com.teambuilding.moolo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/moolo")
class Controller {

    @Autowired lateinit var repo: CommentRepository

    @GetMapping("/hi")
    fun foo(): String {
        repo.save(Comment("123", "Aldo"))
        val comment = repo.findByName("Aldo")
        println(comment)

        return "hi"
    }
}