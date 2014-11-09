

package com.gabino.proyecto;
import java.util.ArrayList;

/**
 *
 * @author Angie
 */
public class Zodiaco {
    private ArrayList<Signo> signos;
   
    public Zodiaco() {
        signos = new ArrayList<Signo>();
        Signo aries = new Signo("Aries","Si tienes una relación de pareja, hoy vas a sentir que los lazos entre ustedes se refuerzan y que conseguirás una sintonía muy buena y profunda. Seguramente podrán compartir muchas cosas hoy y la comunicación entre ustedes sea muy fluida, lo que hará que te sientas muy feliz.");
        Signo tauro = new Signo("Tauro","Te encontrarás con un antiguo compañero del colegio o del instituto. Después de muchos años se volverán a ver las caras. Es posible que ni te reconozca.");
        Signo geminis = new Signo("Geminis","Recuperarás algo que dabas por perdido. Desde ese momento te notarás con más fuerzas. Piensas que si te propones algo acabarás consiguiéndolo gracias a tu esfuerzo y dedicación.");
        Signo cancer = new Signo("Cancer","Cuando llegas a casa lo único que te apetecerá será sentarte en tu sillón y escuchar un poco de música o ver una buena película. No dejes que nadie te interrumpa.");
        Signo leo = new Signo("Leo","Una buena noticia te llega a través de un mensaje o de una llamada. Parece ser que se resolverán una serie de asuntos económicos o legales que te preocupaban.");
        Signo virgo = new Signo("Virgo","No te preocupes tanto por los problemas de los demás. Siempre estás dispuesto a colaborar con todo el mundo, pero a veces no recibes respuesta cuando tú te encuentras en apuros.");
        Signo libra = new Signo("Libra","No te compliques la vida incorporando a tu dieta sustancias químicas o pastillas porque simplemente otras personas te lo hayan recomendado. En caso de duda siempre hay que consultar con un médico.");
        Signo escorpio = new Signo("Escorpio","Procura no gastar más de lo necesario hasta que tu situación económica se estabilice. Lo mejor es que aguantes el mayor tiempo posible sin solicitar préstamos al banco.");
        Signo sagitario = new Signo("Sagitario","Es posible que se malinterpreten tus palabras si no te expresas adecuadamente. Tú tienes las ideas muy claras y tratas de transmitir un mensaje a los demás.");
        Signo capricornio = new Signo("Capricornio","Ten cuidado con las inversiones que realices. Es posible que todo salga bien al final, pero te llevarás más de un disgusto si confías en gente desconocida que vaya con malas intenciones.");
        Signo acuario = new Signo("Acuario","Tu vida está más o menos encarrilada. Por eso te mostrarás dispuesto a ayudar a los demás. Sabes que hay gente que lo está pasando mucho peor que tú.");
        Signo picis = new Signo("Picis","Antes de realizar cualquier inversión importante deberías valorar muy bien las consecuencias. Quizás no sea el momento más adecuado para gastarse tanto dinero en un vehículo nuevo.");
        
        signos.add(aries);
        signos.add(tauro);
        signos.add(geminis);
        signos.add(cancer);
        signos.add(leo);
        signos.add(virgo);
        signos.add(libra);
        signos.add(escorpio);
        signos.add(sagitario);
        signos.add(capricornio);
        signos.add(acuario);
        signos.add(picis);
        
    }
    
    public String leerFuturo(String parametro) {
      String tuFuturo=" Siempre vas a ser feliz :D";
      for(Signo s:signos){
      if(parametro.equalsIgnoreCase(s.getSigno())){
          tuFuturo=s.getConsulta();
                }
          
          }
        return tuFuturo;
}
    
}
