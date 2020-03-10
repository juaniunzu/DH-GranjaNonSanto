package com.company;

import com.company.animal.Cocodrilo;
import com.company.animal.Oveja;
import com.company.animal.Pollo;
import com.company.animal.Vaca;

public class Main {

    public static void main(String[] args) {

        Vaca unaVaca = new Vaca(101001, "vaca01", 100, false);
        Vaca otraVaca = new Vaca(100303, "vaca02", 110, false);
        Vaca unaNuevaVaca = new Vaca(041203, "vaca03", 5, true);
        Oveja unaOveja = new Oveja(240805, "oveja01", 3);
        Oveja otraOveja = new Oveja(150904, "oveja02", 2);
        Oveja unaNuevaOveja = new Oveja(101101, "oveja03", 4);
        Pollo unPollo = new Pollo(070707, "pollo01", 15);
        Pollo otroPollo = new Pollo(100109, "pollo02", 14);
        Pollo unNuevoPollo = new Pollo(020210, "pollo03", 13);
        Cocodrilo unCocodrilo = new Cocodrilo(010101, "coco1", 2);
        Cocodrilo otroCocodrilo = new Cocodrilo(020202, "coco2", 1);
        Tomaco unLoteDeTomaco = new Tomaco(250);

        Pastor pastorPepe = new Pastor("Pepe");

        GranjaNonSanta laGranja = new GranjaNonSanta(pastorPepe);

        pastorPepe.agregarAnimalesAPastorear(unaVaca);
        pastorPepe.agregarAnimalesAPastorear(otraVaca);
        pastorPepe.agregarAnimalesAPastorear(unaNuevaVaca);
        pastorPepe.agregarAnimalesAPastorear(otraOveja);
        pastorPepe.agregarAnimalesAPastorear(unaOveja);
        pastorPepe.agregarAnimalesAPastorear(unaNuevaOveja);
        pastorPepe.agregarAnimalesAPastorear(unPollo);
        pastorPepe.agregarAnimalesAPastorear(unNuevoPollo);
        pastorPepe.agregarAnimalesAPastorear(otroPollo);

        laGranja.enviarAPastorear();






    }
}
