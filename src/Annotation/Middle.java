package Annotation;

class Middle implements MyMethod {

    @Override
    public void middleOfInt() {
        int summa = 0;
        double middle;
        int[] array = {5, 8, 6, 12, 2, 4};
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i]; }
        middle = summa / array.length;
        System.out.println("Среднее значение массива:" + middle);
    }
}





