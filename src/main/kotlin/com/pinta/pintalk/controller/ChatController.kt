package com.pinta.pintalk.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController {

    @GetMapping("hello")
    fun ciao(): ResponseEntity<String> {
        return ResponseEntity.ok().body("ciao")
    }

}
