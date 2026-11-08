package de.robv.android.xposed;
import java.lang.reflect.Method;
public abstract class XC_MethodHook { protected void beforeHookedMethod(MethodHookParam p) throws Throwable {} protected void afterHookedMethod(MethodHookParam p) throws Throwable {} public static class Unhook { public void unhook() {} } public static class MethodHookParam { public Object thisObject; public Object[] args; public Method method; } }
