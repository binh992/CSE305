public class ConfidentialDoc extends Document {

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncrytion() {
        this.encryption = "AES";
    }

    @Override
    public Document buildDoc() {
        return this;
    }

}
