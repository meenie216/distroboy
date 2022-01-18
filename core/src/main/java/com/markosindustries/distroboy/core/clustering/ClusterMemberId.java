package com.markosindustries.distroboy.core.clustering;

import com.google.protobuf.ByteString;
import java.util.Objects;
import java.util.UUID;

public final class ClusterMemberId {
  private final UUID uuid;

  public ClusterMemberId() {
    this.uuid = UUID.randomUUID();
  }

  private ClusterMemberId(UUID uuid) {
    this.uuid = uuid;
  }

  public UUID getUUID() {
    return uuid;
  }

  public ByteString asBytes() {
    return UUIDs.asBytes(uuid);
  }

  public static ClusterMemberId fromBytes(ByteString bytes) {
    return new ClusterMemberId(UUIDs.fromBytes(bytes));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterMemberId that = (ClusterMemberId) o;
    return uuid.equals(that.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid);
  }

  @Override
  public String toString() {
    return "db-cm-" + uuid;
  }
}
