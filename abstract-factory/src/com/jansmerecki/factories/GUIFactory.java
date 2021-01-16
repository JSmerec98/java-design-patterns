package com.jansmerecki.factories;

import com.jansmerecki.buttons.Button;
import com.jansmerecki.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}