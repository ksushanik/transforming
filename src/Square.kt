class Square(x: Double, y: Double, var side: Double) : Figure(x, y), Transforming {
    override fun area(): Double = side * side
    override fun perimeter(): Double = 4 * side

    override fun rotate(angle: Double) {
        // Вращение квадрата не меняет его формы
    }

    override fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    override fun scale(factor: Double) {
        side *= factor
    }

    override fun toString(): String = "Square(x=$x, y=$y, side=$side)"
}