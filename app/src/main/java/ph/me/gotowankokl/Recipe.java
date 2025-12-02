package ph.me.gotowankokl;

public class Recipe {
    private String recipeName;
    private String category;
    private int imgId;
    private String ingridients;
    private String description;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
        category = "ciasteczka";
        imgId = R.drawable.ic_launcher_background;
        ingridients = "";
        description = "";
    }

    public Recipe(String recipeName, String category, int imgId, String ingridients, String description) {
        this.recipeName = recipeName;
        this.category = category;
        this.imgId = imgId;
        this.ingridients = ingridients;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getImgId() {
        return imgId;
    }

    public String getIngridients() {
        return ingridients;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Przepis{" +
                "NazwaPrzepisu='" + recipeName + '\'' +
                '}';
    }
}
