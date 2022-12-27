package com.ksaraev.spotifyrunning.service;

import com.ksaraev.spotifyrunning.client.dto.recommendation.SpotifyRecommendationFeatures;
import com.ksaraev.spotifyrunning.model.playlist.SpotifyPlaylist;
import com.ksaraev.spotifyrunning.model.playlist.SpotifyPlaylistDetails;

import javax.validation.constraints.NotNull;

public interface SpotifyRunning {

  SpotifyPlaylist createPlaylist(
      @NotNull SpotifyPlaylistDetails playlistDetails,
      SpotifyRecommendationFeatures recommendationFeatures);
}
