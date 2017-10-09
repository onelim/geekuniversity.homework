package ru.geekuniveersity.homework.j2.lesson2;

public class WrongDataArrayException extends Exception {
    public WrongDataArrayException(Object type, int outerIndex, int index) {
        super("Тип " + type.getClass() + " по индексу: " + "[" + outerIndex + "]" + " " + "[" + index + "]" + " не является числом!");
    }
}
