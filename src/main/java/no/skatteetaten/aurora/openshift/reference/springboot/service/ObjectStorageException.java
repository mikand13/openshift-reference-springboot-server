package no.skatteetaten.aurora.openshift.reference.springboot.service;

public class ObjectStorageException extends RuntimeException {
    public ObjectStorageException(String msg, Exception e) {
        super(msg, e);
    }
}
