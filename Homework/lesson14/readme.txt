1. а) Створити динамічний масив, що містить об'єкти класу HeavyBox.
    б) Роздрукувати його, використовуючи for each.
    в) Змінити вагу першого ящику на 1.
    г) Видалити останній ящики.
    д) Видалити всі ящики.
2. Отримати масив, що містить об'єкти класу HeavyBox з колекції трьома способами і вивести на консоль.
3. Створити TreeSet, що містить HeavyBox. HeavyBox має реалізувати інтерфейс Comparable. Надрукувати вміст за допомогою for each.
4. Користувач вводить набір чисел у вигляді одного рядка "1, 2, 3, 4, 4, 5". Позбутися повторюваних елементів у рядку і вивести результат на екран.
5. Напишіть методи union(Set<?>... set) та intersect(Set<?> ... set), що реалізують операції об'єднання та перетину множин. Протестуйте роботу цих методів на попередньо заповнених множинах.
6. Створити чергу, що містить об'єкти класу HeavyBox. Використовуємо клас ArrayDeque. Розмістити об'єкти в чергу за допомогою методу offer(). Видалити об'єкти методом poll().
7. Створити колекцію, яка містить об'єкти HeavyBox. Написати метод, який перебирає елементи колекції та перевіряє вагу коробок. Якщо вага коробки більша за 300 гр, коробка переміщається в іншу колекцію.
8. Створіть HashMap, що містить пари значень - ім'я іграшки та об'єкт іграшки (клас Product).
Перебрати та роздрукувати пари значень – entrySet().
Перебрати та роздрукувати набір із імен продуктів - keySet().
Перебрати та роздрукувати значення продуктів – values(). Для кожного перебору створити свій метод.
9. Створити клас Student, у якому такі характеристики – ім'я, група, курс, оцінки з предметів. Створити колекцію, яка містить об'єкти класу Student. Написати метод, який видаляє студентів із середнім балом <3. Якщо середній бал>=3, студент переводиться на наступний курс. Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів та номер курсу. А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
10. Створіть клас Pet та його спадкоємців Cat, Dog, Parrot. Створіть відображення з домашніх тварин, де як ключ виступає ім'я тварини, а як значення клас Pet. Додайте у відображення різних тварин. Створіть метод, який виводить на консоль усі ключі відображення.
11. Замість масивів використовуйте колекції. Створити метод, який роздруковує товари каталогу, відсортовані за ім'ям, ціною або рейтингом. Додати можливість сортувати у зворотному порядку. (Інтернет магазин)