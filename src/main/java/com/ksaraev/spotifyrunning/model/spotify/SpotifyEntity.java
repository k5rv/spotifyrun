package com.ksaraev.spotifyrunning.model.spotify;

import java.net.URI;

public interface SpotifyEntity {

  String getId();

  void setId(String id);

  String getName();

  void setName(String name);

  URI getUri();

  void setUri(URI uri);
}