package reusing;

/***
 * 结合使用组合和继承
 */

class Place {
    Place (int i) {
        System.out.println("place constructor");
    }
}
class DinnerPlace extends Place {
    DinnerPlace (int i) {
        super(i);
        System.out.println("dinnerplace constructor");
    }
}

class Utensil {
    Utensil (int i) {
        System.out.println("unensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon (int i) {
        super(i);
        System.out.println("spoon constructor");
    }
}

class Fork extends Utensil {
    Fork (int i) {
        super(i);
        System.out.println("fork constructor");
    }
}

public class PlaceSetting {

}
