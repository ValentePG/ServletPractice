package dev.valente.model;

public class UsuarioTeste {
    private String name;
    private String role;
    private String profission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsuarioTeste(String name, String role) {
        this.name = name;
        this.role = role;
    }


    public UsuarioTeste() {
    }

    @Override
    public String toString() {
        return "UsuarioTeste{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", profission='" + profission + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfission() {
        return profission;
    }

    public void setProfission(String profission) {
        this.profission = profission;
    }
}
