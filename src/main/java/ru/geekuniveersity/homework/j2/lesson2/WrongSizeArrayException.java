package ru.geekuniveersity.homework.j2.lesson2;

public class WrongSizeArrayException extends Exception {
    public WrongSizeArrayException(Object[] size, int initialSize) {
        super("Неверная длинна массива: " + size.length + " ---- массив не должен быть меньше: " + initialSize);
    }
}
