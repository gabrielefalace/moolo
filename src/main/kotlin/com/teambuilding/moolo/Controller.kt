package com.teambuilding.moolo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/moolo")
class Controller {

    @GetMapping("/hi")
    fun foo(): String {
        return "hi"
    }
}