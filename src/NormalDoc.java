public class NormalDoc extends Document {

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncrytion() {
        this.encryption = "None";
    }

    @Override
    public Document buildDoc() {
        return this;
    }
}
