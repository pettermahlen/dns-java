package com.spotify.dns;

import com.google.auto.value.AutoValue;

/**
 * Immutable data object with the relevant parts of an SRV record.
 */
@AutoValue
public abstract class LookupResult {
  public abstract String host();
  public abstract int port();
  public abstract int priority();
  public abstract int weight();
  public abstract long ttl();

  public static LookupResult create(String host, int port, int priority, int weight, long ttl) {
    return new AutoValue_LookupResult(host, port, priority, weight, ttl);
  }
}
