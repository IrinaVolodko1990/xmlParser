package by.volodko.epam.xml_xsd.entity;

public class Newspaper extends AbstractPaper {
    private boolean color;
    private Frequency frequency;

    public Newspaper() {

    }

    public Newspaper(String name, String subscriptionIndex, String website, AgeCategory ageCategory,
                     int circulation, PaperProperties paperProperties, boolean color, Frequency frequency) {
        super(name, subscriptionIndex, website, ageCategory, circulation, paperProperties);
        this.color = color;
        this.frequency = frequency;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = Frequency.valueOf(frequency.toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Newspaper)) return false;
        if (!super.equals(o)) return false;

        Newspaper newspaper = (Newspaper) o;

        if (color != newspaper.color) return false;

        return frequency == newspaper.frequency;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color ? 1 : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder newspaper = new StringBuilder();
        newspaper.append(super.toString())
                .append("\nFrequency: ").append(frequency);
        if (color) {
            newspaper.append("\nColor: Polychrome");
        } else {
            newspaper.append("\nColor: Monochrome");
        }

        return newspaper.toString();
    }
}