package com.pinta.pintalkapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
    info = @Info(
        title = "PintalkAPI",
        description = "Pintalk rest APIs definitions and documentation"
    ),
    security = @SecurityRequirement(name = "basic")
)
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "basic")
public class SwaggerConfig {
}
