public class Matrix {
    // Переменные
public double[][] array;
    public int rows;
   public int columns;


    public Matrix(double[][] array) {
        this.array = array;
        this.rows = array.length;
        this.columns = array[0].length;
    }

    // Методы
    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Матрицы разных размеров нельзя сложить");
        }

        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = this.array[i][j] + otherMatrix.array[i][j];
            }
        }

        return new Matrix(resultArray);
    }

    public Matrix multiply(double scalar) {
        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = this.array[i][j] * scalar;
            }
        }

        return new Matrix(resultArray);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Нельзя умножить матрицы: неправильные размеры");
        }

        double[][] resultArray = new double[this.rows][otherMatrix.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    resultArray[i][j] += this.array[i][k] * otherMatrix.array[k][j];
                }
            }
        }

        return new Matrix(resultArray);
    }
}
