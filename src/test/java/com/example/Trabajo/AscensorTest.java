package com.example.Trabajo;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {

    
    @Test
    public void crearPersonaEnPisoValido(){
        Ascensor persona = new Ascensor();
        Integer resultado = persona.crearPersona(4);
        assertEquals(1, resultado);
        
    }

    @Test
    public void verificarPosicionInicialAscensor(){
        Ascensor persona = new Ascensor();
        
        assertEquals('*', persona.poscicionInicialAscensor());
        
    }

    @Test
    public void llamarAscensor(){
        Ascensor persona = new Ascensor();
        Integer pisoPersona = persona.crearPersona(4);
        assertEquals('*', persona.llamadaDePiso(pisoPersona));
    }

    @Test
    public void verificarUsuarioSubioAscensor(){
        Ascensor persona = new Ascensor();
        Integer pisoPersona = persona.crearPersona(1);
        assertEquals('*', persona.llamadaDePiso(pisoPersona));
        assertEquals('X', persona.pasajeroSubeAscensor(pisoPersona));
    }
}
