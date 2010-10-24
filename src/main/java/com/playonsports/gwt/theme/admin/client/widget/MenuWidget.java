package com.playonsports.gwt.theme.admin.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.Widget;

public class MenuWidget extends Widget implements HasHTML {

    public interface Style extends CssResource {
        String active();
    }

    interface Binder extends UiBinder<Element, MenuWidget> {
    };

    private static Binder binder = GWT.create(Binder.class);

    @UiField
    Element title;

    @UiField
    Element list;

    public MenuWidget() {
        setElement(binder.createAndBindUi(this));
    }

    @Override
    public String getHTML() {
        return this.list.getInnerHTML();
    }

    @Override
    public String getText() {
        return this.list.getInnerText();
    }

    @Override
    public String getTitle() {
        return this.title.getInnerText();
    }

    @Override
    public void setHTML(String html) {
        this.list.setInnerHTML(html);
    }

    @Override
    public void setText(String text) {
        this.list.setInnerText(text);
    }

    @Override
    public void setTitle(String title) {
        this.title.setInnerText(title);
    }

}
