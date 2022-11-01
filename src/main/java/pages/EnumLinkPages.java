package pages;

public enum EnumLinkPages {
    ADD_REMOVE_ELEMENTS("Add/Remove Elements"),
    BASIC_AUTH("Basic Auth"),
    BROKEN_IMAGES("Broken Images"),
    CHALLENGING_DOM("Challenging DOM"),
    CHECKBOXES("Checkboxes"),
    CONTEXT_MENU("Context Menu");

    private final String text;
    EnumLinkPages(String text){
        this.text = text;
    }


    public String getText(){
        return text;
    }

    public EnumLinkPages getPage(EnumLinkPages page){
        return page;
    }
}
