package com.osfunapps.wazehelperservice

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent




/**
 * Created by shabat on 18/08/2018.
 */

class WazeAccessibilityService : AccessibilityService() {

    private lateinit var systemServicesConfigure: SystemServicesConfigure


    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        Log.d("wazeHelperService", "event: " + event.eventType)

        systemServicesConfigure.turnBluetoothOn()
    }

    override fun onCreate() {
        super.onCreate()
        systemServicesConfigure = SystemServicesConfigure()
        Log.d("wazeHelperService", "created!")
    }

    override fun onInterrupt() {}

}