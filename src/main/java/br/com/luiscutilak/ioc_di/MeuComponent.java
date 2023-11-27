package br.com.luiscutilak.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    
    
    public String chamarMeuComponent() {
        return "chamando meu componente";
    }
}
