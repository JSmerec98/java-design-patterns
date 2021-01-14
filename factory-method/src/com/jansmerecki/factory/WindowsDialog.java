package com.jansmerecki.factory;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}