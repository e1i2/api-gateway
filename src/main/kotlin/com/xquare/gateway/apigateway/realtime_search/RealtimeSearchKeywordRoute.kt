package com.xquare.gateway.apigateway.realtime_search

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class RealtimeSearchKeywordRoute(
    private val builder: RouteLocatorBuilder
) {
    private val apiUri = "http://realtime-search-api.app.svc.cluster.local"

    @Bean
    fun realtimeSearchKeywordRouteAll() = builder.routes {
        route("realtime-search-keyword-all", uri = apiUri) {
            path("/api-public/realtime-search-keyword/**")
        }
    }
}
