package com.playonsports.gwt.theme.admin.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class ThemeEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        ThemeResources theme = GWT.create(ThemeResources.class);
        theme.style().ensureInjected();

        Resources resources = GWT.create(Resources.class);
        resources.style().ensureInjected();

    }

}
