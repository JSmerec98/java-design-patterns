package com.jansmerecki.factory;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}