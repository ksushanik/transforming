fun main() {
    val rect = Rect(0.0, 0.0, 4.0, 3.0)
    val circle = Circle(1.0, 1.0, 2.0)
    val square = Square(2.0, 2.0, 5.0)

    println("Исходные фигуры:")
    println(rect)
    println(circle)
    println(square)

    println("\nПосле перемещения на (2, 2):")
    rect.move(2.0, 2.0)
    circle.move(2.0, 2.0)
    square.move(2.0, 2.0)
    println(rect)
    println(circle)
    println(square)

    println("\nПосле масштабирования в 1.5 раза:")
    rect.scale(1.5)
    circle.scale(1.5)
    square.scale(1.5)
    println(rect)
    println(circle)
    println(square)

    println("\nПосле поворота на 90 градусов:")
    rect.rotate(90.0)
    circle.rotate(90.0)
    square.rotate(90.0)
    println(rect)
    println(circle)
    println(square)
}