public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        
        Contract permanent = client.requestCreateRentalContract(new Permanent());
        Contract longTerm = client.requestCreateRentalContract(new LongTerm());
        Contract shortTerm = client.requestCreateRentalContract(new ShortTerm());
        
        System.out.println(permanent.toString());
        System.out.println(longTerm.toString());
        System.out.println(shortTerm.toString());
    }
}
