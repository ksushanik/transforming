class Rect(x: Double, y: Double, var width: Double, var height: Double) : Figure(x, y), Transforming {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)

    override fun rotate(angle: Double) {
        if (angle % 180 != 0.0) {
            width = height.also { height = width }
        }
    }

    override fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    override fun scale(factor: Double) {
        width *= factor
        height *= factor
    }

    override fun toString(): String = "Rect(x=$x, y=$y, width=$width, height=$height)"
}