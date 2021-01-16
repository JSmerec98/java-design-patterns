package com.jansmerecki.factories;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.buttons.WindowsButton;
import com.jansmerecki.checkboxes.Checkbox;
import com.jansmerecki.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}