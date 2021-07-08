float AMP = 60;

public class Circle implements Comparable<Circle> {
  //Properties
  //Class fields
  private float x;
  private float y;
  private float radius;
  private float angle;
  private color clr;

  //Constructor
  public Circle(float _x, float _angle, color _clr) {
    this.x = _x;
    this.angle = _angle;
    this.clr = _clr;

    this.radius = 40;
    this.y = height/2.0f;
  }

  //Methods (Actions)
  public void drawSelf() {
    fill(clr);
    ellipse(x, y, radius, radius);
  }

  public void move() {
    angle -= PI/60.0f;
    y = height/2.0f + (AMP * sin(angle));
    radius = 40 + 20 * sin(angle + PI/2);
  }

  public float getRadius() {
    return radius;
  }

  @Override
  public int compareTo(Circle other) {
    if (radius - other.getRadius() > 0) {
      return 1;
    } else {
      return -1;
    }
  }
}
