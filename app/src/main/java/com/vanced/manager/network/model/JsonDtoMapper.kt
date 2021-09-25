package com.vanced.manager.network.model

import com.vanced.manager.domain.model.Json
import com.vanced.manager.domain.util.EntityMapper

class JsonDtoMapper(
    private val appDtoMapper: AppDtoMapper
) : EntityMapper<JsonDto, Json> {

    override suspend fun mapToModel(entity: JsonDto): Json =
        with(entity) {
            Json(
                isMicrogBroken = isMicrogBroken,
                manager = appDtoMapper.mapToModel(manager),
                vanced = appDtoMapper.mapToModel(vanced),
                music = appDtoMapper.mapToModel(music),
                microg = appDtoMapper.mapToModel(microg)
            )
        }

}