package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAIService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestion de Peliculas {{plataform}}.
            Usa menos de 120 caracteres y hazlo con el estilo de platzi
            """)
    String generateGreeting(@V("plataform") String plataform);
}
