package com.xquare.gateway.apigateway.feltpen

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeltpenRoute(
    private val builder: RouteLocatorBuilder
) {
    private val uri = "http://feltpen-server.app.svc.cluster.local"

    @Bean
    fun feltpenRouteAll() = builder.routes {
        route("feltpen-all", uri = uri) {
            path("/api-public/feltpen/**")
        }
    }
}
