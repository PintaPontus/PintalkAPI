package com.pinta.pintalk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PintalkApplication

fun main(args: Array<String>) {
    runApplication<PintalkApplication>(*args)
}
