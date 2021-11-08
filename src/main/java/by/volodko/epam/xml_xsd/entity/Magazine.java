package by.volodko.epam.xml_xsd.entity;

public class Magazine extends AbstractPaper{
    private Direction direction;

    public Magazine() {

    }

    public Magazine(String name, String subscriptionIndex, String website, AgeCategory ageCategory,
                    int circulation, PaperProperties paperProperties, Direction direction) {
        super(name, subscriptionIndex, website, ageCategory, circulation, paperProperties);
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setDirection(String direction) {
        this.direction = Direction.valueOf(direction.toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return direction == magazine.direction;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder magazine = new StringBuilder();
        magazine.append(super.toString())
                .append("\nDirection: ").append(direction);

        return magazine.toString();
    }}