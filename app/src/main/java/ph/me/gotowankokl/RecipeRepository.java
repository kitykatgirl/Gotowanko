package ph.me.gotowankokl;

import java.util.ArrayList;

public class RecipeRepository {
    private static ArrayList<Recipe> recipes;

    private static void generateRecipe(){
        recipes.add(new Recipe("Grzaniec","Napoje", R.drawable.grzaniec,"grzaniec, cytryna, inne cos", "podgrzzewasz i dodajesz te zeczy. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla aliquam massa at nibh accumsan posuere. Donec mattis blandit tincidunt. Duis eget ex a libero scelerisque lacinia. Vivamus convallis id urna quis lacinia. Aenean et porta eros. Nulla varius nulla a nibh porttitor, a rhoncus nisl fermentum. Duis vel nisi id sapien feugiat mattis. In ac purus gravida, luctus arcu at, vulputate magna. Morbi nec tellus vel ligula tempus venenatis eget sit amet nisi."));
        recipes.add(new Recipe("Rosol","Zupy",R.drawable.rosol,"Kurczak, woda, magi","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam tincidunt euismod pellentesque. Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed facilisis, sapien ut finibus commodo, tortor mi dapibus nunc, vel dapibus mauris sapien vel leo. Donec ornare orci in aliquet blandit. Nullam lacinia ex vel auctor faucibus. Quisque nec nisi ac velit faucibus bibendum eu sit amet diam. Proin non nunc orci. Vivamus orci nunc, pulvinar quis tellus volutpat, pretium condimentum elit. Nulla interdum eros vitae eros porttitor, et egestas tortor condimentum. Nunc finibus porttitor tempus. Proin pretium interdum nunc at fermentum. Nunc ornare iaculis tellus ut ultricies. Etiam sed nisl tempus, accumsan nibh ac, feugiat nulla."));
        recipes.add(new Recipe("Barszcz","Zupy",R.drawable.barszcz,"rosol ze wczoraj, dedykacja","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut dolor et elit ullamcorper imperdiet in quis magna. In ut metus leo. Proin eu mauris lacus. Integer sit amet dignissim augue. Vivamus justo mauris, sodales in interdum quis, imperdiet sit amet risus. Cras magna leo, lacinia a lorem semper, bibendum pulvinar neque. Fusce tempor, est vel consequat condimentum, tortor arcu feugiat massa, eleifend fringilla nunc orci eu odio. Proin sollicitudin metus id vehicula facilisis. In vehicula erat ipsum. Curabitur odio eros, placerat nec porta sed, iaculis volutpat libero."));
        recipes.add(new Recipe("Pierniki","Ciasteczka",R.drawable.piernik,"mąka, woda, cukier, piernik", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ac magna nisi. Proin egestas leo nulla. Praesent id fringilla mauris. Vestibulum dapibus erat lobortis, fermentum mauris quis, convallis tellus. In sed eleifend ligula, feugiat fringilla nunc. Proin malesuada augue felis, eu pretium nisi vehicula id. Nullam pulvinar maximus urna sed semper. Etiam tincidunt quam at posuere bibendum. Proin felis diam, euismod eget enim sed, tristique porttitor nibh. Nam urna nisi, tincidunt porta elit quis, lacinia facilisis enim. Duis justo arcu, tincidunt ultrices lacus a, tincidunt vulputate metus. Nullam eget tincidunt nisl, finibus venenatis justo. Sed consequat aliquam iaculis. Curabitur ac convallis nunc. Morbi ipsum nunc, ullamcorper quis blandit tempor, consequat nec ligula."));
    }

    public static ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
