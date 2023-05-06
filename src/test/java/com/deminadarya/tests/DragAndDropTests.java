package com.deminadarya.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTests {

    @Test
    void dragAndDropFiguresInPlaces() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a header").shouldHave(Condition.text("B"));
    }
}
