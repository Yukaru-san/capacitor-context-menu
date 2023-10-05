package com.yukaru.plugin.ccm;

import android.content.Intent;
import android.os.Bundle;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.yukaru.plugin.ccm.utils.Utils;

@CapacitorPlugin(name = "ContextMenu")
public class ContextMenuPlugin extends Plugin {

    private static final String PROCESS_TEXT_EVENT = "processTextReceived";

    @Override
    protected void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        String action = intent.getAction();

        if (!Intent.ACTION_PROCESS_TEXT.equals(action)) {
            return;
        }

        JSObject data = Utils.parseIntentExtras(intent.getExtras());
        System.out.println(data);
        notifyListeners(PROCESS_TEXT_EVENT, data, true);
    }

    @PluginMethod
    public void checkProcessTextIntentReceived(PluginCall call) {
        Intent intent = getActivity().getIntent();

        if (intent == null || !Intent.ACTION_PROCESS_TEXT.equals(intent.getAction())) {
            call.reject("No PROCESS_TEXT intent received");
        }

        Bundle extras = intent.getExtras();
        JSObject data = Utils.parseIntentExtras(extras);
        call.resolve(data);
    }
}
