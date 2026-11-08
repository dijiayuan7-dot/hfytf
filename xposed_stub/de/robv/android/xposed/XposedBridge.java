package de.robv.android.xposed;
public final class XposedBridge {
    public static XC_MethodHook.Unhook hookAllMethods(Class<?> clazz, String methodName, XC_MethodHook callback) { return new XC_MethodHook.Unhook(); }
    public static void log(String message) {}
    public static void log(Throwable throwable) {}
}
