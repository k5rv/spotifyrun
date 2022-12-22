package com.ksaraev.spotifyrunning.client.dto.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ksaraev.spotifyrunning.client.dto.items.SpotifyItem;
import lombok.Value;

import java.util.List;

@Value
public class AudioFeaturesItemsResponse implements SpotifyItemsResponse {
  @JsonProperty("audio_features")
  List<SpotifyItem> items;

  @JsonCreator
  public AudioFeaturesItemsResponse(final List<SpotifyItem> items) {
    this.items = items;
  }
}