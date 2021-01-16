package com.jansmerecki.factories;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.buttons.MacOSButton;
import com.jansmerecki.checkboxes.Checkbox;
import com.jansmerecki.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}