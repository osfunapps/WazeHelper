package com.osfunapps.wazehelperservice

import android.bluetooth.BluetoothAdapter


class SystemServicesConfigure {

    /*fun checkSystemServicesStatus(context: Context) {
        checkBluetoothService()
        checkLocationServices(context)
    }


    private fun checkBluetoothService() {
        val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        if (mBluetoothAdapter != null)
            SystemServicesStatus.turnedOffByUser = mBluetoothAdapter.isEnabled

    }

    private fun checkLocationServices(context: Context) {
        val lm = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        try {
            val gpsEnabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER)
            val networkEnabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
            SystemServicesStatus.locationServicesOn = networkEnabled && gpsEnabled
        } catch (ex: Exception) {
            Log.d("wazeHelperService", "crash on system service check: " + ex.message)
            SystemServicesStatus.locationServicesOn = false
        }
    }

    fun setLocationServices(context: Context, on: Boolean) {
        *//*ActivityCompat.requestPermissions(context,
                { Manifest.permission.READ_EXTERNAL_STORAGE},
                1);*//*
    }

    */fun turnBluetoothOn() {
        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        bluetoothAdapter.enable()
    }
}
