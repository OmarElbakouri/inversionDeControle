package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"daoV2", "metier"})  // Spring va scanner ces packages
public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(PresentationSpringAnnotation.class);

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat (Spring @Annotation) = " + metier.calcul());
    }
}
