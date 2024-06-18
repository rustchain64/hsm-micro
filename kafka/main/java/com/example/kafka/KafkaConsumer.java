@Service
public class KafkaConsumer {

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
