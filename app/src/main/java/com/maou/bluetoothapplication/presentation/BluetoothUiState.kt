package com.maou.bluetoothapplication.presentation

import com.maou.bluetoothapplication.domain.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
