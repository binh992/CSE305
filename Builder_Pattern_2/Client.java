public class Client {
    public void newDocument(Document docBuilder) {
        docBuilder.setExtension();
        docBuilder.setEncryption();
        Document document = docBuilder.buildDoc();
        System.out.println(document);
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("=== Normal Document ===");
        client.newDocument(new NormalDoc());

        System.out.println("\n=== Confidential Document ===");
        client.newDocument(new ConfidentialDoc());
    }
}
