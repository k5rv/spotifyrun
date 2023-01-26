package com.ksaraev.spotifyrunning.client.items;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;

public record SpotifyTrackItemAudioFeatures(
    @JsonProperty("duration_ms") Integer durationMs,
    @JsonProperty("time_signature") Integer timeSignature,
    @JsonProperty("track_href") URL trackHref,
    @JsonProperty("analysis_url") URL analysisUrl,
    BigDecimal danceability,
    BigDecimal energy,
    Integer key,
    BigDecimal loudness,
    Integer mode,
    BigDecimal speechiness,
    BigDecimal acousticness,
    BigDecimal instrumentalness,
    BigDecimal liveness,
    BigDecimal valence,
    BigDecimal tempo,
    String type,
    String id,
    URI uri) {}
