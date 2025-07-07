package com.crayon.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


import org.springframework.security.oauth2.server.resource.web.BearerTokenResolver;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ResourceServer {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().disable()
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/login", "oauth/authorize", "oauth/check_token","oauth2/token").permitAll()
                        .anyRequest().authenticated()
                ).httpBasic()
                .and()
                .oauth2ResourceServer(oauth2 -> oauth2
                        .bearerTokenResolver(customBearerTokenResolver())
                        .opaqueToken(opaque -> opaque
                                .introspectionUri("http://localhost:8080/oauth2/introspect")
                                .introspectionClientCredentials("crayonApp", "cRaY0NApp")
                        )
                );


        return http.build();
    }

    @Bean
    public BearerTokenResolver customBearerTokenResolver() {
        return new TokenExtractor();
    }


}
