package com.realityexpander.zombieoutbreaklocator.api.googlemaps.geocode
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Southwest(
    @SerialName("lat")
    val lat: Double,
    @SerialName("lng")
    val lng: Double
)