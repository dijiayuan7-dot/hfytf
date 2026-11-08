package de.robv.android.xposed;
public final class XposedBridge { private XposedBridge() {} public static XC_MethodHook.Unhook hookAllMethods(Class<?> c,String n,XC_MethodHook h){return new XC_MethodHook.Unhook();} public static void log(String s){} public static void log(Throwable t){} }
