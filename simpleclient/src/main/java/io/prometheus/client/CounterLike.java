package io.prometheus.client;

public interface CounterLike {
  void inc();

  void inc(double amt);
}
