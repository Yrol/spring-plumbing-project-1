package com.yrol.plumbing.services;

import com.yrol.plumbing.document.DocType;
import com.yrol.plumbing.document.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Contributing the class to SpringContext using @Service annotation.
 * Similarly, we can use @Component or @Repository
 * */
@Service
public class DocumentService {

    @Bean
    Document newDocument() {
        DocType docType =  new DocType();
        return new Document(docType);
    }
}
