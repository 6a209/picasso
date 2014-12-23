package com.squareup.picasso;

/** TODO */
@SuppressWarnings("PointlessBitwiseExpression") public enum NetworkPolicy {

  /** TODO */
  NO_CACHE(1 << 0),

  /** TODO */
  NO_STORE(1 << 1),

  /** TODO */
  OFFLINE(1 << 2);

  static boolean shouldReadFromDiskCache(int networkPolicy) {
    return (networkPolicy & NetworkPolicy.NO_CACHE.index) == 0;
  }

  static boolean shouldWriteToDiskCache(int networkPolicy) {
    return (networkPolicy & NetworkPolicy.NO_STORE.index) == 0;
  }

  static boolean isOfflineOnly(int networkPolicy) {
    return (networkPolicy & NetworkPolicy.OFFLINE.index) == NetworkPolicy.OFFLINE.index;
  }

  final int index;

  private NetworkPolicy(int index) {
    this.index = index;
  }
}
