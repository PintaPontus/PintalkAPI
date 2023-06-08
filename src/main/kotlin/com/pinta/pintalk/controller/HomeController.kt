package com.pinta.pintalk.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller("/")
class HomeController {

    @GetMapping("/hello")
    fun ciao(): ResponseEntity<String> {
        return ResponseEntity.ok().body("ciao")
    }

}
