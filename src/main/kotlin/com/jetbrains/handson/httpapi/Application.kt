package com.jetbrains.handson.httpapi

import io.ktor.application.*
import io.ktor.features.*
import kotlinx.serialization.json.json


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
install(ContentNegotiation)
    json()
}
