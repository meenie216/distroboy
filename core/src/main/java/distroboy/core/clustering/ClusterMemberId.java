package distroboy.core.clustering;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.UUID;

public interface ClusterMemberId {
  UUID self = UUID.randomUUID();

  static ByteString uuidAsBytes(UUID uuid) {
    return ByteString.copyFrom(
        ByteBuffer.allocate(16)
            .putLong(uuid.getMostSignificantBits())
            .putLong(uuid.getLeastSignificantBits())
            .array());
  }

  static UUID uuidFromBytes(ByteString bytes) {
    final var byteBuffer = bytes.asReadOnlyByteBuffer();
    final var msb = byteBuffer.getLong();
    final var lsb = byteBuffer.getLong();
    return new UUID(msb, lsb);
  }
}
