package com.jansmerecki.app;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.checkboxes.Checkbox;
import com.jansmerecki.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}