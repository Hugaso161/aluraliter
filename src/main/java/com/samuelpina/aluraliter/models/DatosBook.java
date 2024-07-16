package com.samuelpina.aluraliter.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBook(
        @JsonAlias("title") String titulo,
        @JsonAlias("languages") List<String> lingua,
        @JsonAlias("authors") List<DatosAuthor> autores,
        @JsonAlias("download_count") int totDownload) {

}
