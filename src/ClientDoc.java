public class ClientDoc {
    public Document newDocument(Document builder) {
        builder.setExtension();
        builder.setEncrytion();
        builder.buildDoc();
        return builder;
    }
}
