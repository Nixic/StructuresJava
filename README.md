# Различные примеры кода на Java

# Коллекции (дополняются...):

#### PriorityQueue (Отсортированная очередь) - использует Comparator при извлечении элементов.
[Example PriorityQueue here](src/main/java/collections/PriorityQueue.java)
#### TreeSetCompare - два примера TreeSet для получения отсортированных списков с использованием Comparable and Comparator интерфейсов.
[Example TreeSetCompare here](src/main/java/collections/TreeSetCompare.java)

# Шаблоны (Patterns, дополняются...):
## Порождающие (creational):
#### Singleton (Одиночка) - ограничивает создание одного экземпляра класса, обеспечивает доступ к его единственному объекту.
#### Гарантирует, что у класса будет всего один экземпляр класса. 
#### Предоставляет глобальную точку доступа к экземпляру данного класса.
[Example Singleton here](src/main/java/patterns/creational/singleton)
#### Factory (Фабрика) - используется, когда у нас есть суперкласс с несколькими подклассами и на основе ввода, нам нужно вернуть один из подкласса.
[Example Factory here](src/main/java/patterns/creational/factory/ShapeFactory.java)
#### Abstract Factory (Абстрактная фабрика) - используем супер фабрику для создания фабрики, затем используем созданную фабрику для создания объектов.
[Example Abstract Factory here](src/main/java/patterns/creational/factory/ShapeFactory.java)
#### Builder (Строитель) - используется для создания сложного объекта с использованием простых объектов. Постепенно он создает больший объект от малого и простого объекта.
[Example Builder here](src/main/java/patterns/creational/builder/BuilderUsageExample.java)
#### Prototype (Прототип) - помогает создать дублированный объект с лучшей производительностью, вместо нового создается возвращаемый клон существующего объекта.
[Example Prototype here](src/main/java/patterns/creational/prototype/PrototypeUsageExample.java)

## Структурные (structural):
#### Adapter (Адаптер) - это конвертер между двумя несовместимыми объектами. Используя паттерн адаптера, мы можем объединить два несовместимых интерфейса.
[Example Adapter here](src/main/java/patterns/structural/adapter/AdapterUsageExample.java)
#### Composite (Компоновщик) - использует один класс для представления древовидной структуры.
[Example Composite here](src/main/java/patterns/structural/composite/CompositeUsageExample.java)
#### Proxy (Заместитель) - представляет функциональность другого класса.
[Example Proxy here](src/main/java/patterns/structural/proxy/ProxyUsageExample.java)
#### Flyweight (Легковес) - вместо создания большого количества похожих объектов, объекты используются повторно.
[Example Flyweight here](src/main/java/patterns/structural/flyweight/FlyweightUsageExample.java)
#### Facade (Фасад) - обеспечивает простой интерфейс для клиента, и клиент использует интерфейс для взаимодействия с системой.
[Example Flyweight here](src/main/java/patterns/structural/facade/FacadeUsageExample.java)
#### Bridge (Мост) - делает конкретные классы независимыми от классов реализации интерфейса.
[Example Bridge here](src/main/java/patterns/structural/bridge/BridgeUsageExample.java)
#### //todo add example:
#### Decorator (Декоратор) - добавляет новые функциональные возможности существующего объекта без привязки его структуры.
[Example Decorator here](src/main/java/patterns/structural/decorator/DecoratorUsageExample.java)

## Поведенческие (behavioral):
#### Template Method (Шаблонный метод) - определяющий основу алгоритма и позволяющий наследникам переопределять некоторые шаги алгоритма, не изменяя его структуру в целом.
[Example Template Method here](src/main/java/patterns/behavioral/templateMethod/TemplateMethodUsageExample.java)
#### Mediator (Посредник) - предоставляет класс посредника, который обрабатывает все коммуникации между различными классами.
#### Chain of Responsibility (Цепочка обязанностей) - позволяет избежать жесткой зависимости отправителя запроса от его получателя, при этом запрос может быть обработан несколькими объектами.
#### Observer (Наблюдатель) - позволяет одним обьектам следить и реагировать на события, происходящие в других объектах.
#### Strategy (Стратегия) - алгоритм стратегии может быть изменен во время выполнения программы.
#### Command (Команда) - интерфейс команды объявляет метод для выполнения определенного действия.
#### State (Состояние) - объект может изменять свое поведение в зависимости от его состояния.
#### Visitor (Посетитель) - используется для упрощения операций над группировками связанных объектов.
#### Interpreter (Интерпретатор) - определяет грамматику простого языка для проблемной области.
#### Iterator (Итератор) - последовательно осуществляет доступ к элементам объекта коллекции, не зная его основного представления.
#### Memento (Хранитель) - используется для хранения состояния объекта, позже это состояние можно восстановить.


# Fun (дополняются...):
#### Различные примеры кода, которые вызывают интерес.
[here](src/main/java/fun)

# Другие структуры (дополняются...):
#### EnumExample
[Example EnumExample here](src/main/java/structure/EnumExample.java)
