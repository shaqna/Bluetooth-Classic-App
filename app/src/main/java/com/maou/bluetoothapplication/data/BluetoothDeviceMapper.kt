package com.maou.bluetoothapplication.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.maou.bluetoothapplication.domain.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}