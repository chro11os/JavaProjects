package security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf((csrf) -> csrf.disable()) // Disable CSRF for simplicity
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/api/users/register").permitAll() // Allow unauthenticated access to /register
                        .anyRequest().authenticated() // Require authentication for other endpoints
                )
                .httpBasic(Customizer.withDefaults()); // Enable basic authentication


        return http.build();
    }
}
