package com.veranicus.bootstrap.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreedNotFoundException extends RuntimeException implements GraphQLError {
    private Map<String,Object> extensions = new HashMap<>();

    public BreedNotFoundException(String message, String invalidBreed) {
        super(message);
        extensions.put("invalidDogId",invalidBreed);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }
}
