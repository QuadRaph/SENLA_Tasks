package task6;

//Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
//Вещи в свою очередь обладают двумя параметрами — весом и стоимостью. Цель задачи заполнить рюкзак
//не превысив его грузоподъемность и максимизировать суммарную ценность груза.

public class Backpack {

    private static int fillBackpack(int[] weightArr, int[] costArr, int currentItem, int capacity) {
        if (capacity == 0 || currentItem == 0) {
            return 0;
        }

        if (weightArr[currentItem - 1] > capacity) {
            return fillBackpack(weightArr, costArr, currentItem - 1, capacity);
        } else {
            int include = costArr[currentItem - 1] + fillBackpack(weightArr, costArr, currentItem - 1, capacity - weightArr[currentItem - 1]);
            int exclude = fillBackpack(weightArr, costArr, currentItem - 1, capacity);
            return Math.max(include, exclude);
        }
    }


    public static void main(String[] args) {
        int capacity = 15;
        int[] value = {90, 140, 110, 80};
        int[] weight = {4, 8, 5, 9};

        for (int i = 0; i < weight.length; i++) {
            System.out.println("Вес предмета номер " + (i + 1) + " = " + weight[i] + ", его стоимость = " + value[i]);
        }
        System.out.println("\nГрузоподъёмность рюкзака: " + capacity);
        int optimize = fillBackpack(weight, value, weight.length, capacity);
        System.out.println("Максимальная суммарная стоимость предметов: " + optimize);
    }

}


