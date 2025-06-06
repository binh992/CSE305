import java.util.*;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}

class MessagePrinter {
    public void printSummary(Message message) {
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender: " + message.getSender());
        System.out.println("Recipient: " + message.getRecipient());
    }

    public void printDetails(Message message) {
        printSummary(message);
        System.out.println("Content Length: " + message.getContent().length());
        System.out.println("Sender Uppercase: " + message.getSender().toUpperCase());
        System.out.println("Recipient Lowercase: " + message.getRecipient().toLowerCase());
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox = new HashMap<>();

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, Collections.emptyList());
    }

    public List<Message> getAllMessages() {
        List<Message> allMessages = new ArrayList<>();
        for (List<Message> messages : inbox.values()) {
            allMessages.addAll(messages);
        }
        return allMessages;
    }
}

public class ImprovedMessagingApp {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();
        MessagePrinter printer = new MessagePrinter();

        service.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        service.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        service.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        System.out.println(">>> Messages for Tenant A:");
        for (Message msg : service.getMessagesForRecipient("Tenant A")) {
            printer.printSummary(msg);
            System.out.println("------");
        }

        System.out.println("\n>>> All Messages (Detailed):");
        for (Message msg : service.getAllMessages()) {
            printer.printDetails(msg);
            System.out.println("======");
        }
    }
}
