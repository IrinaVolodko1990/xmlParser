package by.volodko.epam.xml_xsd.handler;

public enum PaperXmlTag {
    PAPERS("papers"),
    NEWSPAPER("newspaper"),
    NAME("name"),
    SUBSCRIPTION_INDEX("subscription-index"),
    ISSUE("issue"),
    PAGES("pages"),
    PRICE("price"),
    ISSUE_DATE("issue-date"),
    CIRCULATION("circulation"),
    COLOR("color"),
    FREQUENCY("frequency"),
    DIRECTION("direction"),
    PAPER_PROPERTIES("paper-properties"),
    AGE_CATEGORY("age-category"),
    WEBSITE("website"),
    MAGAZINE("magazine");


    private String value;

    PaperXmlTag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}