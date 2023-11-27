package br.com.luiscutilak.ioc_di;

import org.springframework.stereotype.Service;

public class MeuComponent {
    
    @Service
    public String chamarMeuComponent() {
        return "chamando meu componente";
    }
}
