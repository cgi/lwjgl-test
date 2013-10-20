Проект создается для изучения возможностей библиотеки работы с 3д графикой.


На текущий момент в примере создано 2 квадрата согласно аналогии из инструкции для начинающих.

Сборка проекта производится чреез Maven 3.
mvn clean install в директории модуля (lwjgl-test)

Команда для запуска и ее вывод:

cgi@iermolin-V3-771:/mnt/ntfs1/data_lib/git_repos/3d-test/lwjgl-test$ java -Djava.library.path=target/natives -jar target/lwjgl-test-1.0-SNAPSHOT-jar-with-dependencies.jar 
Hello World!
The end!


