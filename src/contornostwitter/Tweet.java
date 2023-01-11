package contornostwitter;

import java.time.LocalDateTime;

/**
 * Esta clase se utiliza para crear un tweet.
 * 
 * Utiliza 2 consutructores para recoger la informacion en las variables.
 * 
 * @author usuario
 * @version 1.0
 * @since 1.0
 * @see UsuarioTwitter
 */
public class Tweet {
    /**
     * El usuario guarda el nombre de la persona que realiza el Tweet
     */
    private final String usuario;
    /**
     * La fecha guarda el momento en que se realiza el Tweet
     */
    private final LocalDateTime fecha;
    /**
     * El contenido guarda el texto del Tweet
     */
    private String contenido;
    /**
     * Los retweets son las veces que este fue compartido
     */
    private int retweets;
    /**
     * Los likes representan a la gente que marco que le gusto el Tweet
     */
    private int like;
    /**
     * Los views representan a la gente que miro el Tweet
     */
    private int views;
    
   /**
    * Constructor para hacer un Tweet simple.
    * 
    * Usaremos este constructor para con solo nombre y el contenido hacer
    *  un Tweet basico.
    * 
    * @param usuario
    * Nombre de la persona que realiza el Tweet
    * @param contenido 
    * El contenido guarda el texto del Tweet
    */
    public Tweet(String usuario, String contenido) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.fecha = LocalDateTime.now();
        this.retweets = 0;
        this.like = 0;
        this.views = 0;
    }
    /**
     * En este constructor asignamos un valor a todas las variables.
     * 
     * @param usuario
     * @param fecha
     * @param contenido
     * @param retweets
     * @param like
     * @param views 
     */
    public Tweet(String usuario, LocalDateTime fecha, String contenido, int retweets, int like, int views) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.contenido = contenido;
        this.retweets = retweets;
        this.like = like;
        this.views = views;
    }
    /**
     * Visualizar likes.
     * @return Numero de likes
     */
    public int getLike() {
        return like;
    }
    /**
     * Introduce el numero de likes
     * @param like 
     */
    public void setLike(int like) {
        this.like = like;
    }
    /**
     * Visualizar el nombre de usuari@.
     * @return nombre del usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Visualizar la fecha del tweet
     * @return fecha del tweet
     */
    public LocalDateTime getFecha() {
        return fecha;
    }
    /**
     * Visualizar contido del tweet.
     * @return contenido del tweet
     */
    public String getContenido() {
        return contenido;
    }
    /**
     * Guarda el contenido de un tweet.
     * Guarda el contenido si es menor de 280 caracteres sino guarda null.
     * @param contenido 
     */
    public void setContenido(String contenido) {
        if (contenido.length() <= 280) {
            this.contenido = contenido;
        } else {
            this.contenido = null;
        }
    }
    /**
     * Visualizar el numero de veces que se compartio.
     * @return las veces que se compartio
     */
    public int getRetweets() {
        return retweets;
    }
    /**
     * Guarda el numero de veces que se compartio
     * @param retweets 
     */
    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }
    /**
     * Visualizar el numero de veces que se visualizo
     * @return veces que se visualizo
     */
    public int getViews() {
        return views;
    }
    /**
     * Guarda el numero de veces que se visualizo
     * @param views 
     */
    public void setViews(int views) {
        this.views = views;
    }
    /**
     * Metodo que suma numero de visualizaciones
     * @param views que se suman a los que ya teniamos 
     */
    public void addViews(int views) {
        this.views += views;
    }
    /**
     * Metodo que suma likes
     * @param like que se suman a los que teniamos 
     */
    public void addLikes(int like) {
        this.like += like;
    }
    /**
     * Metodo que suma retweets
     * @param retweets que se suman a los que teniamos
     */
    public void addRetweets(int retweets) {
        this.retweets += retweets;
    }
    /**
     * Visualiza el numero de caracteres de el contenido.
     * @return longitud de el contenido del tweet
     */
    public int tamanho() {

        return this.contenido.length();
    }
    /**
     * Visualiza todas las variables del objeto en un string
     * @return todo lo que contiene el objeto
     * @Override
     */
    
    public String toString() {
        return usuario + "\n" + fecha + "\n" + contenido + "\n" + "like " + like
                + "  Ret " + retweets + "    Vistos por " + views + " usuarios";
    }

}
