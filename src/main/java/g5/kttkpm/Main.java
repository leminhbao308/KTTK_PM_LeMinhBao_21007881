package g5.kttkpm;

import g5.kttkpm.singleton.EagerInitializedSingleton;

public class Main {
    
    public static void main(String[] args) {
        // EagerInitializedSingleton
        EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eis2 = EagerInitializedSingleton.getInstance();
        
        System.out.println("EagerInitializedSingleton 1: " + eis1.hashCode());
        System.out.println("EagerInitializedSingleton 2: " + eis2.hashCode());
        
    }
}
