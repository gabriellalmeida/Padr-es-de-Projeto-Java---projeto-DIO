package one.digitalinovation.gof;

import one.digitalinovation.gof.facede.Facede;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton:

        SingletonLazy Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        System.out.println("\n");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println("\n");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefencivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();


        // Facede

        Facede facede = new Facede();
        facede.migrarCliente("Gabriel", "48730000");
    }
}
