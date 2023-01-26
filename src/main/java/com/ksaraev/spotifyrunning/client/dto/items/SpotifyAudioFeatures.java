package com.ksaraev.spotifyrunning.client.dto.items;

import java.math.BigDecimal;

public interface SpotifyAudioFeatures {

  Integer getKey();

  Integer getMode();

  Integer getDurationMs();

  Integer getTimeSignature();

  BigDecimal getTempo();

  BigDecimal getEnergy();

  BigDecimal getValence();

  BigDecimal getLiveness();

  BigDecimal getLoudness();

  BigDecimal getSpeechiness();

  BigDecimal getAcousticness();

  BigDecimal getDanceability();

  BigDecimal getInstrumentalness();
}