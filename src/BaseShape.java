/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Абстрактний клас BaseShape геометричних фігур
 */
public abstract class BaseShape {
	
	//some change 
	
    /**
     * X фігури
     */
    protected int x;
    /**
     * У фігури
     */
    protected int y;
    /**
     * Колір фігури
     */
    protected Color color;

    /**
     * Kонструктор, який приймає обєкт для клонування
     *
     * @param baseShape обєкт для клонування
     */
    BaseShape(BaseShape baseShape) {
        if(baseShape==null)
            throw new NullPointerException();
        this.x = baseShape.x;
        this.y = baseShape.y;
        this.color = baseShape.color;
    }

    /**
     * Конструктор, який приймає дані фігури
     *
     * @param x     координата фігури
     * @param y     координата фігури
     * @param color колір фігури
     */
    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Абстрактний метод виводу
     *
     * @return інформацію про фігуру
     */
    public abstract String toString();

    /**
     * Копіювання елемента
     *
     * @return копію елемента
     */
    protected abstract BaseShape clone();
}
