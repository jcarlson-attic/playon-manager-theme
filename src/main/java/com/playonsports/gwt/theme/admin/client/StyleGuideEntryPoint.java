package com.playonsports.gwt.theme.admin.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class StyleGuideEntryPoint extends Composite implements EntryPoint {

    interface Binder extends UiBinder<Widget, StyleGuideEntryPoint> {
    }

    private static Binder binder = GWT.create(Binder.class);

    StyleGuideEntryPoint() {
        initWidget(binder.createAndBindUi(this));
    }

    @Override
    public void onModuleLoad() {
        RootLayoutPanel.get().add(this);
    }

}
