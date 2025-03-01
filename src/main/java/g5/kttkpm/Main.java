package g5.kttkpm;

import g5.kttkpm.singleton.*;

import java.lang.reflect.Constructor;

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
        // LazyInitializedSingleton lis1 = LazyInitializedSingleton.getInstance();
        // LazyInitializedSingleton lis2 = LazyInitializedSingleton.getInstance();
        
        // System.out.println("LazyInitializedSingleton 1: " + lis1.hashCode());
        // System.out.println("LazyInitializedSingleton 2: " + lis2.hashCode());
        
        // ThreadSafeSingleton
        // ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
        // ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
        
        // System.out.println("ThreadSafeSingleton 1: " + tss1.hashCode());
        // System.out.println("ThreadSafeSingleton 2: " + tss2.hashCode());
        
        // ThreadSafeSingleton Double Check Locking
        // ThreadSafeSingleton dcl1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        // ThreadSafeSingleton dcl2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        
        // System.out.println("ThreadSafeSingleton Double Check Locking 1: " + dcl1.hashCode());
        // System.out.println("ThreadSafeSingleton Double Check Locking 2: " + dcl2.hashCode());
        
        // BillPughSingleton
        // BillPughSingleton bps1 = BillPughSingleton.getInstance();
        // BillPughSingleton bps2 = BillPughSingleton.getInstance();
        
        // System.out.println("BillPughSingleton 1: " + bps1.hashCode());
        // System.out.println("BillPughSingleton 2: " + bps2.hashCode());
        
        // ReflectionSingletonTest
        /*
        EagerInitializedSingleton instanceOne =
            EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors =
                EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)
                    constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Instance 1: " + instanceOne.hashCode());
        System.out.println("Instance 2: " + instanceTwo.hashCode());
         */
        
        // EnumSingleton
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        
        System.out.println("EnumSingleton 1: " + es1.hashCode());
        System.out.println("EnumSingleton 2: " + es2.hashCode());
    }
}
