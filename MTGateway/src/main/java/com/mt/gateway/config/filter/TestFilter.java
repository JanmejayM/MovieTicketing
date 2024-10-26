package com.mt.gateway.config.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class TestFilter implements GatewayFilter,Ordered{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		ServerHttpRequest httpRequest=exchange.getRequest();
       
		return chain.filter(exchange.mutate().request(httpRequest).build());
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return -1;
	}

	

}
