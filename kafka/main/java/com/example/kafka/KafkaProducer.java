@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "users";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
