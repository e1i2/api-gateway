//package com.xquare.gateway.apigateway.feltpen
//
//import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class FeltpenRoute {
//    private val apiUri = "http://feltpen-api.dev"
//
//    @Bean
//    fun feltpenBaseRoutes(dsl: RouteLocatorDsl) = dsl.route("feltpen-all", uri = apiUri) {
//        path("/feltpen")
//    }
//}
