package ru.geekuniveersity.homework.j2.lesson2;

public class WrongDataArrayException extends Exception {
    public WrongDataArrayException(Object type, int outterIndex, int index) {
        super("Тип " + type.getClass() + " по индексу: " + "[" + outterIndex + "]" + " " + "[" + index + "]" + " не является числом!");
    }
}
