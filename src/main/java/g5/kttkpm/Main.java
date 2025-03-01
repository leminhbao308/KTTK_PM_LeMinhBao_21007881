package g5.kttkpm;

import g5.kttkpm.singleton.EagerInitializedSingleton;
import g5.kttkpm.singleton.LazyInitializedSingleton;
import g5.kttkpm.singleton.StaticBlockSingleton;

public class Main {
    
    public static void main(String[] args) {
        // EagerInitializedSingleton
        // EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
        // EagerInitializedSingleton eis2 = EagerInitializedSingleton.getInstance();
        
        // System.out.println("EagerInitializedSingleton 1: " + eis1.hashCode());
        // System.out.println("EagerInitializedSingleton 2: " + eis2.hashCode());
        
        // StaticBlockSingleton
        // StaticBlockSingleton sbs1 = StaticBlockSingleton.getInstance();
        // StaticBlockSingleton sbs2 = StaticBlockSingleton.getInstance();
        
        // System.out.println("StaticBlockSingleton 1: " + sbs1.hashCode());
        // System.out.println("StaticBlockSingleton 2: " + sbs2.hashCode());
        
        // LazyInitializedSingleton
        LazyInitializedSingleton lis1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lis2 = LazyInitializedSingleton.getInstance();
        
        System.out.println("LazyInitializedSingleton 1: " + lis1.hashCode());
        System.out.println("LazyInitializedSingleton 2: " + lis2.hashCode());
        
    }
}
