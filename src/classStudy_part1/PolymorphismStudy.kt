package classStudy_part1

interface Drawable {
  fun draw(c: Canvas)
}

class Canvas(width: Int, height: Int) {
  fun drawToCanvas(d: Drawable) {
    d.draw(this)
  }
}

class DrawableRectangle(val width: Int, val height: Int): Drawable {
  private fun drawRectangle(c: Canvas) {
    println("draw ${width} x ${height} rectangle")
  }

  override fun draw(c: Canvas) = drawRectangle(c)
}

fun main() {
  val c = Canvas(500, 500)
  val drawables = mutableListOf<Drawable>()
  drawables.add(DrawableRectangle(200, 200))

  for(d in drawables) {
    c.drawToCanvas(d)
  }
}

