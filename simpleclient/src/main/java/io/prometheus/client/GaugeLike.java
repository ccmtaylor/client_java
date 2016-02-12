package io.prometheus.client;

public interface GaugeLike {
  void inc();

  void inc(double amt);

  void dec();

  void dec(double amt);

  void set(double val);

  void setToCurrentTime();

  Gauge.Timer startTimer();
}
