package com.rosan.dhizuku.server

import com.rosan.dhizuku.aidl.IDhizukuClient
import com.rosan.dhizuku.server_api.DhizukuProvider
import com.rosan.dhizuku.server_api.DhizukuService

class MyDhizukuProvider : DhizukuProvider() {
    override fun onCreateService(client: IDhizukuClient): DhizukuService {
        return MyDhizukuService(context, DhizukuDAReceiver.name, client)
    }
}