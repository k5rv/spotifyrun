package com.ksaraev.spotifyrun.service;

import com.ksaraev.spotifyrun.client.SpotifyClient;
import com.ksaraev.spotifyrun.client.requests.GetItemsRequest;
import com.ksaraev.spotifyrun.client.responses.GetSeveralArtistsResponse;
import com.ksaraev.spotifyrun.model.artist.ArtistMapper;
import com.ksaraev.spotifyrun.model.spotify.SpotifyArtist;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@Validated
@AllArgsConstructor
public class ArtistService implements SpotifyArtistService {
  private final SpotifyClient spotifyClient;
  private final ArtistMapper artistMapper;

  @Override
  public List<SpotifyArtist> getArtists(@NotNull List<String> ids) {
    GetItemsRequest request = new GetItemsRequest(ids);
    GetSeveralArtistsResponse response = spotifyClient.getSeveralArtists(request);

    List<SpotifyArtist> artists =
        response.artistItems().stream()
            .filter(Objects::nonNull)
            .map(artistMapper::toModel)
            .map(SpotifyArtist.class::cast)
            .toList();

    if (artists.isEmpty()) {
      return List.of();
    }

    return artists;
  }
}