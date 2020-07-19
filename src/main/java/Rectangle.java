/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */

public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;
            if ((getColor() == rectangle.getColor() && getColor() == null)
                    && (getLength() == rectangle.getLength() && getLength() == null)
                    && (getWidth() == rectangle.getWidth() && getWidth() == null)
                    && (hashCode() == rectangle.hashCode())) {
                return true;
            }
            if ((getWidth().equals(rectangle.getWidth())
                    && getLength().equals(rectangle.getLength())
                    && getColor().equals(rectangle.getColor()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {

        int colorHashCode = 0;
        int lengthHashCode = 0;
        int widthHashCode = 0;
        if (color != null) {
            colorHashCode = color.hashCode();
        }
        if (length != null) {
            lengthHashCode = length.hashCode();
        }
        if (width != null) {
            widthHashCode = width.hashCode();
        }
        int startCode = 5;
        int code;
        int rezultColorHashCode = 31 * startCode + colorHashCode;
        int lengthCode = 31 * rezultColorHashCode + lengthHashCode;
        code = 31 * lengthCode + widthHashCode;
        return code;
    }
}
