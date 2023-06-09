package com.xquare.gateway.apigateway.configuration

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RouteConfiguration {
    @Bean
    fun routeLocatorDsl(builder: RouteLocatorBuilder) = RouteLocatorDsl(builder)
}
