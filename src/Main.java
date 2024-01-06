public class Main {
        public static void main(String[] args) {
            // Пример использования класса Matrix
            double[][] array1 = {{1, 2, 3}, {4, 5, 6}};
            double[][] array2 = {{7, 8}, {9, 10}, {11, 12}};

            Matrix matrix1 = new Matrix(array1);
            Matrix matrix2 = new Matrix(array2);

            System.out.println("Матрица №1:");
            matrix1.print();

            System.out.println("\nМатрица №2:");
            matrix2.print();

            System.out.println("\nУмножение матриц:");
            try {
                Matrix productMatrix = matrix1.multiply(matrix2);
                productMatrix.print();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
