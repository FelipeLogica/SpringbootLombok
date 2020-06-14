package Voigt.Felipe.ExercicioSpringboosLombok.controler;

import Voigt.Felipe.ExercicioSpringboosLombok.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;


@RestController
public class ClienteController {


    @GetMapping("/Clientes")
    public ArrayList<Cliente> indexCliente() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Felipe", "Voigt", 18, "123.456.789-10"));
        clientes.add(new Cliente("Duda","Coan",18,"109.876.543-21"));
        return clientes;
    }
}
