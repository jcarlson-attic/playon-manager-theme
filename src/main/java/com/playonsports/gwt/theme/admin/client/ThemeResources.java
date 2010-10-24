package com.playonsports.gwt.theme.admin.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

interface ThemeResources extends ClientBundle {

    @Source("img/background.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource background();

    @Source("img/button_disabled.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource button_disabled();

    @Source("img/button_highlight.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource button_highlight();

    @Source("img/button_normal.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource button_normal();

    @Source( { "css/constants.css", "css/html.css", "css/forms.css" })
    CssResource style();

}
