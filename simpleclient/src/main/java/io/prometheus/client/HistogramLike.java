package io.prometheus.client;

public interface HistogramLike {
  void observe(double amt);

  Histogram.Timer startTimer();
}
