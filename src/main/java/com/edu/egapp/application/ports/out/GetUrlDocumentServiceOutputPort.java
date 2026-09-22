package com.edu.egapp.application.ports.out;

import org.jsoup.nodes.Document;

public interface GetUrlDocumentServiceOutputPort {

    Document get() throws Exception;
}
