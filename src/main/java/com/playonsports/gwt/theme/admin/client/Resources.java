package com.playonsports.gwt.theme.admin.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

public interface Resources extends ClientBundle {

    @Source("img/10.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity10();

    @Source("img/20.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity20();

    @Source("img/30.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity30();

    @Source("img/40.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity40();

    @Source("img/50.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity50();

    @Source("img/60.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity60();

    @Source("img/70.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity70();

    @Source("img/80.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity80();

    @Source("img/90.png")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource opacity90();

    @Source("img/room_tab_active.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource room_tab_active();

    @Source("img/room_tab_inactive.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource room_tab_inactive();

    @Source( { "css/constants.css", "css/layout.css" })
    Style style();

}
