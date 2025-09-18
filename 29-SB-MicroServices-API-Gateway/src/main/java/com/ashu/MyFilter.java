package com.ashu;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class MyFilter implements GlobalFilter{
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		for(String s : exchange.getRequest().getHeaders().keySet()) {
			System.out.println(s+" : "+exchange.getRequest().getHeaders().get(s));
		}
		return chain.filter(exchange);
}
}
