package com.example.aodsuspendtest;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_LoadPackage.LoadPackageParam;
import de.robv.android.xposed.XposedBridge;

/** Small, dependency-free entry point so LSPosed can load the module reliably. */
public final class Entry implements IXposedHookLoadPackage {
    @Override public void handleLoadPackage(LoadPackageParam param) throws Throwable {
        if (!"com.android.systemui".equals(param.packageName)) return;
        XposedBridge.log("AOD Suspend Test v0.3 loaded for SystemUI");
        new MainHook().handleLoadPackage(param);
    }
}
