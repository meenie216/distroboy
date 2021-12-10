package distroboy.kafka;

import java.util.Collection;
import java.util.Map;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.TopicPartition;

public class EarliestKafkaOffsetSpec implements KafkaOffsetSpec {
  @Override
  public <K, V> Map<TopicPartition, Long> getOffsets(
      Consumer<K, V> kafkaConsumer, Collection<TopicPartition> topicPartitions) {
    return kafkaConsumer.beginningOffsets(topicPartitions);
  }
}
