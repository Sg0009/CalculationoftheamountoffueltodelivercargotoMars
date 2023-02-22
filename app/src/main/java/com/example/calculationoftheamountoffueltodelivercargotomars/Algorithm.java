package com.example.calculationoftheamountoffueltodelivercargotomars;

public class Algorithm {



    // создание пустого конструктора
    public Algorithm() {
    }



    // метод вычисляющий количество топлива
    public long calculationOfTheAmountOfFuel(String input) {

        /** Необходимо проверить корректность ввода массы тела, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */

        final long acc ; // acc = acceleration_of_free_fall, тоесть acc это ускорение свободного падения
        float acc1 =  (float) 9.80665; // ускорение свободного падения на Земле
        float acc2 =  (float) 3.721; // ускорение свободного падения на Марсе
        long fuelMassPerKilogramOnMars = 0; // масса для вывода ны орбиту 1 кг груза на Марсе
        float fuelMassPerKilogramOnEarth = 100; // масса для вывода ны орбиту 1 кг груза на Земле

        // подсчёт массы для вывода ны орбиту 1 кг груза на Марсе
        if (acc1 > acc2){

            /**
             * масса для вывода ны орбиту 1 кг груза на Марсе = масса для вывода ны орбиту 1 кг груза на Марсе / ( ускорение свободного падения на Земле / ускорение свободного падения на Марсе )
             */
            fuelMassPerKilogramOnMars = (long) (fuelMassPerKilogramOnEarth /(acc1/acc2));
        }
        else {

        }

        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (long) (inputFloat * fuelMassPerKilogramOnMars  );

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (long) (inputFloat  * fuelMassPerKilogramOnMars);
        }
    }

}
