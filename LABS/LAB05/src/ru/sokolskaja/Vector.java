package ru.sokolskaja;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        this.x = this.y = this.z = 0;
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод, вычисляющий длину вектора
     */
    public double lenVector() {
        int x = this.x;
        int y = this.y;
        int z = this.z;
        double len = Math.abs(Math.sqrt(x * x + y * y + z * z));
        len = Math.round(len * 100.0) / 100.0;
        return len;
    }

    /**
     * Метод, вычисляющий скалярное произведение
     */
    public int scalar(Vector vector) {
        int x = this.x;
        int y = this.y;
        int z = this.z;
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * Метод, вычисляющий векторное произведение с другим вектором
     */
    public Vector vectorMulti(Vector vector) {
        Vector v = new Vector();
        v.x = this.y * vector.z - this.z * vector.y;
        v.y = this.z * vector.x - this.x * vector.z;
        v.z = this.x * vector.y - this.y * vector.x;
        return v;
    }

    /**
     * Метод, вычисляющий косинус угла между векторами
     */
    public double cosVector(Vector vector) {
        double cos = this.scalar(vector) / (this.lenVector() * vector.lenVector());
        cos = Math.round(cos * 100.0) / 100.0;
        return cos;
    }

    /**
     * Методы для сложения и вычитания векторов
     */
    public Vector sum(Vector vector) {
        Vector v = new Vector();
        v.x = this.x + vector.x;
        v.y = this.y + vector.y;
        v.z = this.z + vector.z;
        return v;
    }
    public Vector diff(Vector vector) {
        Vector v = new Vector();
        v.x = this.x - vector.x;
        v.y = this.y - vector.y;
        v.z = this.z - vector.z;
        return v;
    }

    /**
     * Статический метод, возвращающий массив случайных векторов, размером N
     */
    public static Vector[] massVector(int n) {
        Vector[] arr = new Vector[5];
        for (int i = 0; i < arr.length; i++) {
            Vector vector = new Vector();
            while (vector.lenVector() != n) {
                vector.x = (int)(Math.random() * 20);
                vector.y = (int)(Math.random() * 20);
                vector.z = (int)(Math.random() * 20);
            }
            arr[i] = vector;
        }
        return arr;
    }

    @Override
    public String toString() {
        return "x=" + x +  ", y=" + y +  ", z=" + z;
    }
}
