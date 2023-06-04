/*
Задача 13. Животные (на наследование)
Нужно:
а) Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
б) В класс Animal добавить переменные food, location и методы makeNoise, eat, sleep.
в) Метод makeNoise должен выводить на консоль "{Имя животного} животное спит".
г) В классах Dog, Cat, Horse переопределить методы makeNoise, eat.
д) Добавить переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
е) Создать класс Ветеринар, в котором определить метод void treatAnimal(Animal animal).
ж) Этот метод должен распечатывать food и location пришедшего на прием животного.
з) В методе main создать массив типа Animal, который содержит животных всех видов.
и) В цикле отправить животных на прием к ветеринару.
 */



public class Main {
    public static void main(String[] args) {
        Animal [] animals = {new Cat("Tom", "fish", "countryside"),
                             new Dog("Jery", "meat", "flat"),
                             new Horse("Ben", "grass", "farm")};

        for (Animal j : animals) {
            Vet.treatAnimal(j);
        }





    }
}