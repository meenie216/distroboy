package distroboy.core.clustering.serialisation;

import distroboy.schemas.Value;

public class BooleanValues implements Serialiser<Boolean> {
  @Override
  public Value serialise(Boolean value) {
    return Value.newBuilder().setBoolValue(value).build();
  }

  @Override
  public Boolean deserialise(Value value) throws Exception {
    return value.getBoolValue();
  }
}
