![Build Status](https://github.com/Space27/Tinkoff_Edu_HW_LokosovD/actions/workflows/build.yml/badge.svg)

Домашние задания курса https://fintech.tinkoff.ru/academy/java ([нынешний аналог](https://education.tbank.ru/academy/backend))

Студент: `Локосов Даниил Дмитриевич`

## Проекты

### 1. [Виселица](src/main/java/edu/project1/RunGame.java)_<sub>[Тесты](src/test/java/edu/project1)</sub>

Требуется написать консольную версию игры Виселица.  
Слово загадывается случайным образом из заранее заданного словаря.

#### Стек

* Java Core

### 2. [Лабиринты](src/main/java/edu/project2/MazePresenter.java)_<sub>[Тесты](src/test/java/edu/project2)</sub>

Требуется реализовать:
* 1 или более алгоритмов генерации лабиринта (реализован алгоритм Прима и клеточный автомат)
* 1 или более алгоритмов решения лабиринта (реализован поиск в глубину и ширину)
* красивую печать в консоль (pretty print) лабиринта и маршрута из точки А в Б

#### Стек

* JCF
* Stream API

### 3. [Анализатор логов](src/main/java/edu/project3/LogAnalyzer.java)_<sub>[Тесты](src/test/java/edu/project3)</sub>

На вход программе через аргументы командной строки задаётся:
* путь к одному или нескольким NGINX лог-файлам в виде локального шаблона или URL
* опциональные временные параметры from и to в формате ISO8601
* необязательный аргумент формата вывода результата: markdown или adoc

Программа должна выполнять следующие задачи:
* Подсчитывать общее количество запросов
* Определять наиболее часто запрашиваемые ресурсы
* Определять наиболее часто встречающиеся коды ответа
* Рассчитывать средний размер ответа сервера

#### Стек

* Picocli
* HttpClient
* RegEx
* JCF

### 4. [Фрактальное пламя](src/main/java/edu/project4/Run.java)_<sub>[Тесты](src/test/java/edu/project4)</sub>

Задача реализовать алгоритм и сделать его многопоточным.  
Функция отрисовки должна принимать все конфигурируемые параметры как аргументы, например, размер изображения или коэффициенты трансформаций.

#### Примеры работы

<img width="640" height="360" alt="1st example" src="https://github.com/user-attachments/assets/9c6888a2-c19a-4a43-94f9-3bd8c080abb6" />
<img width="640" height="360" alt="2nd example" src="https://github.com/user-attachments/assets/aba36166-99f3-46d9-88f3-b93b2fdacc64" />
<img width="640" height="360" alt="3rd example" src="https://github.com/user-attachments/assets/8cd5f6de-8e35-4958-ab62-7aaa63a8af05" />

#### Стек

* Concurrency
* ImageIO

### 5. [Быстрая рефлексия](src/main/java/edu/project5/ReflectionBenchmark.java)

В этом задании потребуется реализовать и сравнить производительность 4 способов обращения к методу Student#name() (или любого другого класса/интерфейса):
* Прямой доступ
* java.lang.reflect.Method
* java.lang.invoke.MethodHandles
* java.lang.invoke.LambdaMetafactory
  
Задание состоит в том, чтобы написать набор JMH-тестов для каждого сценария и сравнить, насколько медленнее работает каждый из способов по сравнению с прямым доступом.

#### Результат

Вид доступа | Счёт | Единицы измерения | Во сколько раз хуже
-- | -- | -- | --
Прямой | 0,517 | ns/op | 1
LambdaMetafactory | 0,772 | ns/op | 1,493230174
MethodHandles | 3,42 | ns/op | 6,615087041
Method | 6,175 | ns/op | 11,94390716

#### Стек

* JMH
* Reflection API
