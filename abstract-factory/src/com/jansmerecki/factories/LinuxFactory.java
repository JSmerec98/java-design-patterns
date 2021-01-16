package com.jansmerecki.factories;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.buttons.LinuxButton;
import com.jansmerecki.checkboxes.Checkbox;
import com.jansmerecki.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
