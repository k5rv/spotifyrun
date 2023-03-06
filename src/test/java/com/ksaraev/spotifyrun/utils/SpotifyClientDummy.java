package com.ksaraev.spotifyrun.utils;

import com.ksaraev.spotifyrun.client.SpotifyClient;
import com.ksaraev.spotifyrun.client.api.*;
import com.ksaraev.spotifyrun.client.items.SpotifyPlaylistItem;
import com.ksaraev.spotifyrun.client.items.SpotifyPlaylistItemDetails;
import com.ksaraev.spotifyrun.client.items.SpotifyUserProfileItem;

public class SpotifyClientDummy implements SpotifyClient {
  @Override
  public SpotifyUserProfileItem getCurrentUserProfile() {
    return null;
  }

  @Override
  public GetUserTopTracksResponse getUserTopTracks(GetUserTopTracksRequest request) {
    return null;
  }

  @Override
  public GetRecommendationsResponse getRecommendations(GetRecommendationsRequest request) {
    return null;
  }

  @Override
  public SpotifyPlaylistItem createPlaylist(
      String userId, SpotifyPlaylistItemDetails playlistItemDetails) {
    return null;
  }

  @Override
  public SpotifyPlaylistItem getPlaylist(String playlistId) {
    return null;
  }

  @Override
  public AddItemsResponse addItemsToPlaylist(String playlistId, AddItemsRequest request) {
    return null;
  }
}