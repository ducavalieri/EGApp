package com.edu.egapp.adapters.out.services;

import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;
import org.jsoup.nodes.Document;
import com.edu.egapp.application.ports.out.GetUrlDocumentServiceOutputPort;

@Service
public class GetUrlDocumentService implements GetUrlDocumentServiceOutputPort {

    @Override
    public Document get() throws Exception {

        Document doc = null;
        try {
        doc = Jsoup
                .connect("https://wap.educacionalcloud.com.br/Pedagogico/Aulas")
                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7)") // Evita bloqueios simples
                .timeout(5000) // Timeout de 5 segundos
                .get();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao acessar a URL: " + e.getMessage());
        }
        return doc;
    }
}
