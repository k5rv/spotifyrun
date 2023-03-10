package com.ksaraev.spotifyrun.client.feign.formatters;

import com.ksaraev.spotifyrun.client.feign.converters.SpotifyClientRequestParameterConverter;
import org.springframework.cloud.openfeign.FeignFormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;

@Component
public class SpotifyClientFeignFormatterRegistrar implements FeignFormatterRegistrar {
  @Override
  public void registerFormatters(FormatterRegistry registry) {
    registry.addConverter(new SpotifyClientRequestParameterConverter());
  }
}
