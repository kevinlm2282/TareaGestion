package com.example.Trabajo;

public class Ascensor {
    private Character [][] ascensor = {{'0'},
                                       {'0'},
                                       {'0'}};

    
                                       
    public Integer crearPersona(Integer piso) {
        poscicionInicialAscensor();
        if (piso == 1 || piso == 2 || piso == 3) {
            if(piso == 1){
                pasajeroSubeAscensor(piso);
            }else{
                llamadaDePiso(piso);
                pasajeroSubeAscensor(piso);
            }

            return piso;
        } else {
            return 1;
        }
    }

    public Character poscicionInicialAscensor() {
        ascensor[2][0] = '*';
        return ascensor[2][0];
    }

    public Character llamadaDePiso(Integer piso) {
        ascensor[2][0] = '0';
        ascensor[piso][0] = '*';
        return ascensor[piso][0];
    }

    public Character pasajeroSubeAscensor(Integer piso) {
        ascensor[piso][0] = 'X';
        return ascensor[piso][0];
    }


}
