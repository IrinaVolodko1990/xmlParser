package by.volodko.epam.xml_xsd.entity;
public abstract class AbstractPaper {
    private String name;
    private String subscriptionIndex;
    private String website;
    private AgeCategory ageCategory;
    private int circulation;
    private PaperProperties paperProperties = new PaperProperties();

    public AbstractPaper() {

    }

    public AbstractPaper(String name, String subscriptionIndex, String website, AgeCategory ageCategory,
                         int circulation, PaperProperties paperProperties) {
        this.name = name;
        this.subscriptionIndex = subscriptionIndex;
        this.website = website;
        this.ageCategory = ageCategory;
        this.circulation = circulation;
        this.paperProperties = paperProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscriptionIndex() {
        return subscriptionIndex;
    }

    public void setSubscriptionIndex(String subscriptionIndex) {
        this.subscriptionIndex = subscriptionIndex;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = AgeCategory.valueOf(ageCategory.toUpperCase());
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public PaperProperties getPaperProperties() {
        return paperProperties;
    }

    public void setPaperProperties(PaperProperties paperProperties) {
        this.paperProperties = paperProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractPaper that = (AbstractPaper) o;

        if (circulation != that.circulation) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (subscriptionIndex != null ? !subscriptionIndex.equals(that.subscriptionIndex) : that.subscriptionIndex != null)
            return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (ageCategory != that.ageCategory) return false;

        return paperProperties != null ? paperProperties.equals(that.paperProperties) : that.paperProperties == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subscriptionIndex != null ? subscriptionIndex.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (ageCategory != null ? ageCategory.hashCode() : 0);
        result = 31 * result + circulation;
        result = 31 * result + (paperProperties != null ? paperProperties.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder paper = new StringBuilder("");
        if (getWebsite() != null) {
            paper.append("\nWebsite: ").append(website);
        }
        paper.append("\nName: ").append(name)
                .append("\nAge category: ").append(ageCategory)
                .append("\nSubscription index: ").append(subscriptionIndex)
                .append(paperProperties)
                .append("\nCirculation: ").append(circulation);

        return paper.toString();
    }
}