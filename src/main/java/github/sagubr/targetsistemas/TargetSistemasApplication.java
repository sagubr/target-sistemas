package github.sagubr.targetsistemas;

import github.sagubr.targetsistemas.service.Desafio3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static github.sagubr.targetsistemas.Desafios.*;

@SpringBootApplication
public class TargetSistemasApplication {

    public static void main(String[] args) {
        SpringApplication.run(TargetSistemasApplication.class, args);

        System.out.println("Desafio 1:");
        desafio1();

        System.out.println("\nDesafio 2:");
        desafio2(21);
        desafio2(26);

        System.out.println("\nDesafio 3:");
        Desafio3.main(args);

        System.out.println("\nDesafio 4:");
        desafio4();

        System.out.println("\nDesafio 5:");
        desafio5("Java Rocks!");
    }

}
