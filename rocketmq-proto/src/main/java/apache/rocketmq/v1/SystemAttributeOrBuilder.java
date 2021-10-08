// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

public interface SystemAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.SystemAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tag
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Message keys
   * </pre>
   *
   * <code>repeated string keys = 2;</code>
   * @return A list containing the keys.
   */
  java.util.List<java.lang.String>
      getKeysList();
  /**
   * <pre>
   * Message keys
   * </pre>
   *
   * <code>repeated string keys = 2;</code>
   * @return The count of keys.
   */
  int getKeysCount();
  /**
   * <pre>
   * Message keys
   * </pre>
   *
   * <code>repeated string keys = 2;</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  java.lang.String getKeys(int index);
  /**
   * <pre>
   * Message keys
   * </pre>
   *
   * <code>repeated string keys = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keys at the given index.
   */
  com.google.protobuf.ByteString
      getKeysBytes(int index);

  /**
   * <pre>
   * Message identifier, client-side generated, remains unique.
   * if message_id is empty, the send message request will be aborted with status `INVALID_ARGUMENT`
   * </pre>
   *
   * <code>string message_id = 3;</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * Message identifier, client-side generated, remains unique.
   * if message_id is empty, the send message request will be aborted with status `INVALID_ARGUMENT`
   * </pre>
   *
   * <code>string message_id = 3;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   * Message body digest
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Digest body_digest = 4;</code>
   * @return Whether the bodyDigest field is set.
   */
  boolean hasBodyDigest();
  /**
   * <pre>
   * Message body digest
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Digest body_digest = 4;</code>
   * @return The bodyDigest.
   */
  apache.rocketmq.v1.Digest getBodyDigest();
  /**
   * <pre>
   * Message body digest
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Digest body_digest = 4;</code>
   */
  apache.rocketmq.v1.DigestOrBuilder getBodyDigestOrBuilder();

  /**
   * <pre>
   * Message body encoding. Candidate options are identity, gzip, snappy etc.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Encoding body_encoding = 5;</code>
   * @return The enum numeric value on the wire for bodyEncoding.
   */
  int getBodyEncodingValue();
  /**
   * <pre>
   * Message body encoding. Candidate options are identity, gzip, snappy etc.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Encoding body_encoding = 5;</code>
   * @return The bodyEncoding.
   */
  apache.rocketmq.v1.Encoding getBodyEncoding();

  /**
   * <pre>
   * Message type, normal, FIFO or transactional.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.MessageType message_type = 6;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <pre>
   * Message type, normal, FIFO or transactional.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.MessageType message_type = 6;</code>
   * @return The messageType.
   */
  apache.rocketmq.v1.MessageType getMessageType();

  /**
   * <pre>
   * Message born time-point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp born_timestamp = 7;</code>
   * @return Whether the bornTimestamp field is set.
   */
  boolean hasBornTimestamp();
  /**
   * <pre>
   * Message born time-point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp born_timestamp = 7;</code>
   * @return The bornTimestamp.
   */
  com.google.protobuf.Timestamp getBornTimestamp();
  /**
   * <pre>
   * Message born time-point.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp born_timestamp = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBornTimestampOrBuilder();

  /**
   * <pre>
   * Message born host. Valid options are IPv4, IPv6 or client host domain name.
   * </pre>
   *
   * <code>string born_host = 8;</code>
   * @return The bornHost.
   */
  java.lang.String getBornHost();
  /**
   * <pre>
   * Message born host. Valid options are IPv4, IPv6 or client host domain name.
   * </pre>
   *
   * <code>string born_host = 8;</code>
   * @return The bytes for bornHost.
   */
  com.google.protobuf.ByteString
      getBornHostBytes();

  /**
   * <pre>
   * Time-point at which the message is stored in the broker.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp store_timestamp = 9;</code>
   * @return Whether the storeTimestamp field is set.
   */
  boolean hasStoreTimestamp();
  /**
   * <pre>
   * Time-point at which the message is stored in the broker.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp store_timestamp = 9;</code>
   * @return The storeTimestamp.
   */
  com.google.protobuf.Timestamp getStoreTimestamp();
  /**
   * <pre>
   * Time-point at which the message is stored in the broker.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp store_timestamp = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStoreTimestampOrBuilder();

  /**
   * <pre>
   * The broker that stores this message. It may be name, IP or arbitrary
   * identifier that uniquely identify the broker.
   * </pre>
   *
   * <code>string store_host = 10;</code>
   * @return The storeHost.
   */
  java.lang.String getStoreHost();
  /**
   * <pre>
   * The broker that stores this message. It may be name, IP or arbitrary
   * identifier that uniquely identify the broker.
   * </pre>
   *
   * <code>string store_host = 10;</code>
   * @return The bytes for storeHost.
   */
  com.google.protobuf.ByteString
      getStoreHostBytes();

  /**
   * <pre>
   * Time-point at which broker delivers to clients.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 11;</code>
   * @return Whether the deliveryTimestamp field is set.
   */
  boolean hasDeliveryTimestamp();
  /**
   * <pre>
   * Time-point at which broker delivers to clients.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 11;</code>
   * @return The deliveryTimestamp.
   */
  com.google.protobuf.Timestamp getDeliveryTimestamp();
  /**
   * <pre>
   * Time-point at which broker delivers to clients.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeliveryTimestampOrBuilder();

  /**
   * <pre>
   * Level-based delay strategy.
   * </pre>
   *
   * <code>int32 delay_level = 12;</code>
   * @return The delayLevel.
   */
  int getDelayLevel();

  /**
   * <pre>
   * If a message is acquired by way of POP, this field holds the receipt.
   * Clients use the receipt to acknowledge or negatively acknowledge the
   * message.
   * </pre>
   *
   * <code>string receipt_handle = 13;</code>
   * @return The receiptHandle.
   */
  java.lang.String getReceiptHandle();
  /**
   * <pre>
   * If a message is acquired by way of POP, this field holds the receipt.
   * Clients use the receipt to acknowledge or negatively acknowledge the
   * message.
   * </pre>
   *
   * <code>string receipt_handle = 13;</code>
   * @return The bytes for receiptHandle.
   */
  com.google.protobuf.ByteString
      getReceiptHandleBytes();

  /**
   * <pre>
   * Partition identifier in which a message is physically stored.
   * </pre>
   *
   * <code>int32 partition_id = 14;</code>
   * @return The partitionId.
   */
  int getPartitionId();

  /**
   * <pre>
   * Partition offset at which a message is stored.
   * </pre>
   *
   * <code>int64 partition_offset = 15;</code>
   * @return The partitionOffset.
   */
  long getPartitionOffset();

  /**
   * <pre>
   * Period of time servers would remain invisible once a message is acquired.
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_period = 16;</code>
   * @return Whether the invisiblePeriod field is set.
   */
  boolean hasInvisiblePeriod();
  /**
   * <pre>
   * Period of time servers would remain invisible once a message is acquired.
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_period = 16;</code>
   * @return The invisiblePeriod.
   */
  com.google.protobuf.Duration getInvisiblePeriod();
  /**
   * <pre>
   * Period of time servers would remain invisible once a message is acquired.
   * </pre>
   *
   * <code>.google.protobuf.Duration invisible_period = 16;</code>
   */
  com.google.protobuf.DurationOrBuilder getInvisiblePeriodOrBuilder();

  /**
   * <pre>
   * Business code may failed to process messages for the moment. Hence, clients
   * may request servers to deliver them again using certain back-off strategy,
   * the attempt is 1 not 0 if message is delivered first time.
   * </pre>
   *
   * <code>int32 delivery_attempt = 17;</code>
   * @return The deliveryAttempt.
   */
  int getDeliveryAttempt();

  /**
   * <pre>
   * Message producer load-balance group if applicable.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Resource producer_group = 18;</code>
   * @return Whether the producerGroup field is set.
   */
  boolean hasProducerGroup();
  /**
   * <pre>
   * Message producer load-balance group if applicable.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Resource producer_group = 18;</code>
   * @return The producerGroup.
   */
  apache.rocketmq.v1.Resource getProducerGroup();
  /**
   * <pre>
   * Message producer load-balance group if applicable.
   * </pre>
   *
   * <code>.apache.rocketmq.v1.Resource producer_group = 18;</code>
   */
  apache.rocketmq.v1.ResourceOrBuilder getProducerGroupOrBuilder();

  /**
   * <code>string message_group = 19;</code>
   * @return The messageGroup.
   */
  java.lang.String getMessageGroup();
  /**
   * <code>string message_group = 19;</code>
   * @return The bytes for messageGroup.
   */
  com.google.protobuf.ByteString
      getMessageGroupBytes();

  /**
   * <pre>
   * Trace context.
   * </pre>
   *
   * <code>string trace_context = 20;</code>
   * @return The traceContext.
   */
  java.lang.String getTraceContext();
  /**
   * <pre>
   * Trace context.
   * </pre>
   *
   * <code>string trace_context = 20;</code>
   * @return The bytes for traceContext.
   */
  com.google.protobuf.ByteString
      getTraceContextBytes();

  /**
   * <pre>
   * Delay time of first recover orphaned transaction request from server.
   * </pre>
   *
   * <code>.google.protobuf.Duration orphaned_transaction_recovery_period = 21;</code>
   * @return Whether the orphanedTransactionRecoveryPeriod field is set.
   */
  boolean hasOrphanedTransactionRecoveryPeriod();
  /**
   * <pre>
   * Delay time of first recover orphaned transaction request from server.
   * </pre>
   *
   * <code>.google.protobuf.Duration orphaned_transaction_recovery_period = 21;</code>
   * @return The orphanedTransactionRecoveryPeriod.
   */
  com.google.protobuf.Duration getOrphanedTransactionRecoveryPeriod();
  /**
   * <pre>
   * Delay time of first recover orphaned transaction request from server.
   * </pre>
   *
   * <code>.google.protobuf.Duration orphaned_transaction_recovery_period = 21;</code>
   */
  com.google.protobuf.DurationOrBuilder getOrphanedTransactionRecoveryPeriodOrBuilder();

  public apache.rocketmq.v1.SystemAttribute.TimedDeliveryCase getTimedDeliveryCase();
}
