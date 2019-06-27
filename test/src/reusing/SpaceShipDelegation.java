package reusing;

/**
 * java 中的代理
 */

/**
 * 飞船控制器构造类
 * SpaceShipDelegation 会代理飞船控制器的构造方法。
 *  继承只能继承单一的类 但是代理却可以实现更加复杂的功能。因为可以代理不同的类。组合实现不一样的功能。
 *
 */
public class SpaceShipDelegation {
    private  String name;
    private  SpaceShipControls controls = new SpaceShipControls();
    public   SpaceShipDelegation (String name) {
        this.name = name;
    }
    // Delegated methods

    public  void  back (int velocity) {
        controls.back(velocity);
    }
    public void  down (int velocity)  {
        controls.down(velocity);
    }
    public void forward (int velocity) {
        controls.forward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protecter =
                new SpaceShipDelegation("NASA PROTECTOR");
        protecter.back(100);
    }
}
