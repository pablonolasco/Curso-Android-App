package com.appone.yanadigital.a1crearinterfaz;

import android.view.KeyEvent;
import android.widget.TextView;

public interface OnEditorActionListener extends TextView.OnEditorActionListener {
   boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent);
}
