package io.prometheus.client;


public interface SummaryLike {
  void observe(double amt);

  Summary.Timer startTimer();
}
