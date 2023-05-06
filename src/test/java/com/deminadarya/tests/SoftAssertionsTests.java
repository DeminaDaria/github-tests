package com.deminadarya.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SoftAssertionsTests {

    @Test
    void goToPageSoftAssertionsViaSearchAndFindJUnit5Code() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        var filterByValue = $("#wiki-pages-filter").setValue("SoftAssertions").closest(".js-wiki-sidebar-toggle-display");
        filterByValue.$("[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));
        $("a[href$='SoftAssertions']").click();
        //проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }

    @Test
    void goToPageSoftAssertionsViaShowMoreAndFindJUnit5Code() {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("a[href$='SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
