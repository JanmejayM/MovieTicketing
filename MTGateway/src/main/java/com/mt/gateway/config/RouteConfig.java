package com.mt.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

	@Bean
	public RouteLocator movieRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/mtgateway/movie/**")
						.filters(f -> f.stripPrefix(1).prefixPath("/api/v1"))
						.uri("http://localhost:8080"))
				.build();
	}

	@Bean
	public RouteLocator m(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/mtgateway/test")
						.filters(f -> f.stripPrefix(1).prefixPath("/api/v1"))
						.uri("http://localhost:8080"))
				.build();
	}

}
