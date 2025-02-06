package ru.netology.javaqa.domjavanetz5.services;

public class BonusService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;// начальный баланс
        int count = 0; //счетчик периода отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;
                money /= 3;
            } else { //иначе работать дальше
                money += income - expenses;
            }
        }
        return count;
    }
}
