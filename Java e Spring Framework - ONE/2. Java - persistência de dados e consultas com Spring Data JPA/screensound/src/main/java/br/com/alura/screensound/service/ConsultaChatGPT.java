package br.com.alura.screensound.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.client.OpenAiApi;

public class ConsultaChatGPT {

    private static OpenAiApi service;

    public static String obterInformacao(String texto) {
        try {
            CompletionRequest requisicao = CompletionRequest.builder()
                    .model("gpt-3.5-turbo-instruct")
                    .prompt("me fale sobre o artista: " + texto)
                    .maxTokens(1000)
                    .temperature(0.7)
                    .build();

            CompletionResult resposta = service.createCompletion(requisicao).blockingGet();
            return resposta.getChoices().get(0).getText().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter informações: " + e.getMessage();
        }
    }
}