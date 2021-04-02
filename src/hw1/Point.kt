package hw1

class Point(private var x: Int, private var y: Int) {

    fun getX(): Int {
        return x
    }

    fun setX(x: Int) {
        this.x = x
    }

    fun getY(): Int {
        return y
    }

    fun setY(y: Int) {
        this.y = y
    }

    fun moveSymetricX() {
        this.y = -y
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point)
            if (this.x == other.x && this.y == other.y)
                return true
        return false
    }

    override fun toString(): String {
        return "Point: X = ${this.x}, Y = ${this.y}"
    }

}