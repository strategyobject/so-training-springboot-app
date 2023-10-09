package com.strategyobject.training.model;

import java.io.Serializable;

public record LoginDto(String username, String password) implements Serializable {
}
