рактическое задание - Spring MVC - библиотека
Задача: RESTful API для управления книгами в библиотеке с использованием Pageable

Создайте сущности Book и Author с соответствующими атрибутами.

Реализуйте CRUD (Create, Read, Update, Delete) операции для книг с использованием Spring Data JPA.

Создайте контроллер для обработки HTTP-запросов, связанных с книгами, в виде RESTful API.

Реализуйте эндпоинты для:
Получения списка всех книг с возможностью сортировки и пагинации. Используйте Pageable для указания страницы и размера страницы.

Получения информации о конкретной книге.

Добавления новых книг.

Обновления информации о книге.

Удаления книги.

Используйте аннотации Spring, такие как @RestController, @GetMapping, @PostMapping, @PutMapping и @DeleteMapping для явного указания операций.

Проверьте, что пагинация работает корректно с использованием Pageable при запросах на получение списка книг.
