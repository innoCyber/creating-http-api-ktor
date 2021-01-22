package com.jetbrains.handson.httpapi.routes

import com.jetbrains.handson.httpapi.models.customerStorage
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.customerRoutes() {
    route("/customer"){
        get{}
        get("{id}"){}
        post {  }
        delete { "{id}" }
    }


    get{
        if(customerStorage.isNotEmpty()){
            call.respond(customerStorage)
        }else{
            call.respondText("Customer list empty", status = HttpStatusCode.NotFound)
        }
    }
}