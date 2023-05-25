Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объём ЖД

3 - Операционная система

4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


***Класс Notebook для магазина техники должен содержать такие поля, как: производитель (бренд), модель, процессор, обьем ОЗУ, объем SSD, ОС, цвет и т.д.
Так же должны присутствовать методы для получения и установки значения в поля класса Notebook, методы фильтрации по заданным критериям, методы вывода на экран.***