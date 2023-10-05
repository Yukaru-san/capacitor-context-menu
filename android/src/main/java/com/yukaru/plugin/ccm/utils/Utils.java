package com.yukaru.plugin.ccm.utils;

import com.getcapacitor.JSObject;

import android.content.Intent;
import android.os.Bundle;

public class Utils {

    public static JSObject parseIntentExtras(Bundle extras) {
        if (extras == null || !extras.containsKey(Intent.EXTRA_PROCESS_TEXT)) {
            return null;
        }

        String text = extras.getCharSequence(Intent.EXTRA_PROCESS_TEXT).toString();
        JSObject data = new JSObject();
        data.put("text", text);

        return data;
    }

}
