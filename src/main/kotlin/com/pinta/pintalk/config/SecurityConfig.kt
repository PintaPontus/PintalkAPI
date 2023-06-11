package com.pinta.pintalk.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@Configuration
@EnableMethodSecurity
class SecurityConfig {
    // extends WebSecurityConfigurerAdapter {
//    @Autowired
//    var userDetailsService: UserDetailsServiceImpl? = null

//    @Autowired
//    private val unauthorizedHandler: AuthEntryPointJwt? = null
//    @Bean
//    fun authenticationJwtTokenFilter(): AuthTokenFilter {
//        return AuthTokenFilter()
//    }

//    @Bean
//    fun authenticationProvider(): DaoAuthenticationProvider {
//        val authProvider = DaoAuthenticationProvider()
//        authProvider.setUserDetailsService(userDetailsService)
//        authProvider.setPasswordEncoder(passwordEncoder())
//        return authProvider
//    }

//    @Bean
//    @Throws(Exception::class)
//    fun authenticationManager(authConfig: AuthenticationConfiguration): AuthenticationManager {
//        return authConfig.authenticationManager
//    }

//    @Bean
//    fun passwordEncoder(): PasswordEncoder {
//        return BCryptPasswordEncoder()
//    }

//    @Bean
//    @Throws(Exception::class)
//    fun filterChain(http: HttpSecurity): SecurityFilterChain {
//        http.csrf { csrf: CsrfConfigurer<HttpSecurity> -> csrf.disable() }
//            .exceptionHandling { exception: ExceptionHandlingConfigurer<HttpSecurity?> ->
//                exception.authenticationEntryPoint(
//                    unauthorizedHandler
//                )
//            }
//            .sessionManagement { session: SessionManagementConfigurer<HttpSecurity?> ->
//                session.sessionCreationPolicy(
//                    SessionCreationPolicy.STATELESS
//                )
//            }
//            .authorizeHttpRequests(
//                Customizer { auth: AuthorizationManagerRequestMatcherRegistry ->
//                    auth.anyRequest().permitAll()
//                }
//            )
////        http.authenticationProvider(authenticationProvider())
////        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter::class.java)
//        return http.build()
//    }
}
