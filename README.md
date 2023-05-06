On this repo used selenide for writing autotests on the https://github.com/ and https://the-internet.herokuapp.com Were used:

* dragAndDropTo
* closest
* shouldHave
* pressTab
* click


<details>

<summary>Answer to the question first task</summary>

#### 1. Есть ли разница между `$("h1 div");` и `$("h1").$("div");` - может ли привести к тому что, поиск найдёт разные элементы?

```
$("h1 div"); - найдет элемент h1, в котором есть child div находящийся на любом уровне вложенности и самый первый по дереву

$("h1").$("div"); - выполнить поиск и сначала найдет первый h1, потом в найденном h1 будет искать div
```

***Пример***

```html

<div>
    <h1>
        <header>1</header>
        <a>2</a>
    </h1>
    <h1>
        <div>3</div>
        <div>4</div>
    </h1>
</div>
```
`$("h1 div");` найдет элемент 3
`$("h1").$("div");` ничего не найдёт, т.к. в первом эл-те h1 нет div
</details>