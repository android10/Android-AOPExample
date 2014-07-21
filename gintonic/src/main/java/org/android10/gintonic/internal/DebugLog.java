/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package org.android10.gintonic.internal;

import android.util.Log;

/**
 * Wrapper around {@link android.util.Log}
 */
public class DebugLog {

  private DebugLog() {}

  /**
   * Send a debug log message
   *
   * @param tag Source of a log message. It usually identifies the class or activity where the log
   * call occurs.
   * @param message The message you would like logged.
   */
  public static void log(String tag, String message) {
    Log.d(tag, message);
  }
}
