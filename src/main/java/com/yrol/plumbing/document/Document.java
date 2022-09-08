package com.yrol.plumbing.document;

public class Document {

    private DocType docType;

    public Document(){}

    public Document(DocType docType) {
        this.docType = docType;
    }

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }
}
