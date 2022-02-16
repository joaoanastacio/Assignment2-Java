package week1.classes;

public class Rectangle {

  private int width;
  private int height;
  private String color;

  public Rectangle(int width, int height) {
    this.width = isValidMeasure(width) ? width : 1;
    this.height = isValidMeasure(height) ? height : 1;
    this.color = "Blue";
  }

  public Rectangle(int width, int height, String color) {
    this.width = isValidMeasure(width) ? width : 1;
    this.height = isValidMeasure(height) ? height : 1;
    this.color = isValidColor(color) ? color : "Blue";
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void draw() {
    for(int i = 1; i <= this.height; i++) {
      for (int j = 1; j <= this.width; j++) {
        System.out.print(this.color.charAt(0));
      }
      System.out.print("\n");
    }
  }

  private boolean isValidMeasure(int measure) {
    return measure > 0;
  }

  private boolean isValidColor(String color) {
    return Character.isUpperCase(color.charAt(0)) && color.length() > 2 && color.length() < 20;
  }
}
