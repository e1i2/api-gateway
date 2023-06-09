package com.xquare.gateway.apigateway.realtime_search

import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class RealtimeSearchRoute(
    private val routeLocatorDsl: RouteLocatorDsl
) {
    private val apiUri = "http://realtime-search-api.dev"
    init {
        routeLocatorDsl.route("feltpen-all", uri = apiUri) {
            path("/api-public/realtime-search-keyword/**")
        }
    }
}
