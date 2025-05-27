public abstract class Document {
    protected String extension;
    protected String encryption;

    public abstract void setExtension();

    public abstract void setEncrytion();

    public abstract Document buildDoc();

    @Override
    public String toString() {
        return "Document [extension=" + extension + ", encryption=" + encryption + "]";
    }

}
