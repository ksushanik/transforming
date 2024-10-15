import kotlin.math.PI

class Circle(x: Double, y: Double, var radius: Double) : Figure(x, y), Transforming {
    override fun area(): Double = PI * radius * radius
    override fun perimeter(): Double = 2 * PI * radius

    override fun rotate(angle: Double) {
        // Вращение круга не меняет его формы
    }

    override fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    override fun scale(factor: Double) {
        radius *= factor
    }

    override fun toString(): String = "Circle(x=$x, y=$y, radius=$radius)"
}