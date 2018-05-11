/* AUTO-GENERATED FILE. DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found. It
 * should not be modified by hand.
 */

package com.android.inputmethod.latin;

public final class Manifest {
  public static final class permission {
    /**
     * A signature-protected permission to ask AOSP Keyboard to close the software keyboard.
     * To use this, add the following line into calling application's AndroidManifest.xml
     * <pre>
     * {@code
     * <uses-permission android:name="com.android.inputmethod.latin.HIDE_SOFT_INPUT"/>
     * }
     * </pre>
     * then call {@link android.content.Context#sendBroadcast(Intent)} as follows:
     * <pre>
     * {@code
     * sendBroadcast(new Intent("com.android.inputmethod.latin.HIDE_SOFT_INPUT")
     * .setPackage("com.android.inputmethod.latin"));
     * }
     * </pre>
     */
    public static final String HIDE_SOFT_INPUT="com.android.inputmethod.latin.HIDE_SOFT_INPUT";
  }

}