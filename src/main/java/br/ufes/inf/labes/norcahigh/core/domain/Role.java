package br.ufes.inf.labes.norcahigh.core.domain;

public enum Role {

    ADMIN("admin"),
    CLIENT("client"),
    PASSENGER("passenger");

    private final String key;

    Role(final String key) {this.key = key;}

    public String getKey() {return key;}
}