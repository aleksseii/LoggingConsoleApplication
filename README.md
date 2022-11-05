# LoggingConsoleApplication
VK Java Course — 2-nd homework: Dependency Injection (DI) on the example of Guice

## Домашнее задание №2: Инъекция зависимостей (DI) на примере Guice

### Описание
Фреймворк Guice в разработке приложений, возможности фреймворка по связыванию классов и созданию фабричных методов обработке аннотаций.

### Цель домашнего задания  
Научиться использовать фреймворк Guice в разработке приложений. Освоить возможности фреймворка по связыванию классов, созданию фабричных методов обработке аннотаций.

### Общие требования
Нужно создать консольное приложение, которое ожидает ввода строки и логирует введенное указанным способом. Это может быть один из трех вариантов: 
* вывод в консоль (enter "console" as cmd arg)
* вывод в файл (enter "file" as cmd arg)
* оба эти варианта сразу (композитное), сначала в консоль, а потом в файл. (enter "composite" as cmd arg)

Вид логирования задается параметром при запуске консольного приложения. Логирование в файл заключает строку в тэг, например, так: <a>input</a>. 
Название тэга также указывается как параметр при запуске приложения. (enter tag name as 2-nd cmd arg)

Каждое логирование сопровождается уникальным порядковым номером.

Все связи классов должны определяться с помощью Guice.
