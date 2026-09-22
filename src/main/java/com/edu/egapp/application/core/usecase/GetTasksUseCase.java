package com.edu.egapp.application.core.usecase;

import com.edu.egapp.application.ports.in.StartProcessInputPort;
import com.edu.egapp.application.ports.out.GetUrlDocumentServiceOutputPort;
import org.jsoup.nodes.Document;

public class GetTasksUseCase implements StartProcessInputPort {

    final private GetUrlDocumentServiceOutputPort getUrlDocumentServiceOutputPort;

    public GetTasksUseCase(GetUrlDocumentServiceOutputPort getUrlDocumentServiceOutputPort) {
        this.getUrlDocumentServiceOutputPort = getUrlDocumentServiceOutputPort;
    }

    @Override
    public void execute() throws Exception {
        // Use the getUrlDocumentServiceOutputPort to get the document
        Document document = getUrlDocumentServiceOutputPort.get();
        System.out.println(document.title());
    }

}
