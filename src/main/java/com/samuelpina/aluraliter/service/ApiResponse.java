package com.samuelpina.aluraliter.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.samuelpina.aluraliter.models.DatosBook;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiResponse(
        @JsonAlias("results") List<DatosBook> bookList) {

}

//this record only is use to get data from API
//due to the API send the data like:
// {
//         "count": <number>,
//         "next": <string or null>,
//         "previous": <string or null>,
//         "results": <array of Books>
// }

//I put this in service, becouse I think that here is better than model