package com.espe_plus.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface EcoAIService {

    @UserMessage("Crea un eslogan ecológico de menos de 100 caracteres para el producto: {{item}}")
    String generateSlogan(@V("item") String item);
}
