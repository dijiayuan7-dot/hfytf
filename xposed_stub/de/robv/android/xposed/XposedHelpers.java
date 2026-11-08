package de.robv.android.xposed;
public final class XposedHelpers {
    public static Class<?> findClass(String name, ClassLoader loader) throws ClassNotFoundException { return Class.forName(name, false, loader); }
}
