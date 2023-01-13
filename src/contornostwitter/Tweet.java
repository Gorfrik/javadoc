package contornostwitter;

import java.time.LocalDateTime;

/**
 * Esta clase se utiliza para crear un tweet.
 *
 * Utiliza 2 constructores para recoger la informacion en las variables.
 *
 * @author usuario
 * @version 1.0
 * @since 1.0
 * @see UsuarioTwitter
 */
public class Tweet {

    private final String usuario;
    private final LocalDateTime fecha;
    private String contenido;
    private int retweets;
    private int like;
    private int views;

    /**
     * Constructor para hacer un Tweet simple.<br>
     *
     * Constructor que crea un Tweet basico con nombre y contenido.
     *
     * @param usuario Nombre de la persona que realiza el Tweet
     * @param contenido El contenido guarda el texto del Tweet
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
     * @param usuario Nombre de la persona que realiza el Tweet
     * @param fecha Fecha en la que se creo el Tweet
     * @param contenido El contenido guarda el texto del Tweet
     * @param retweets Numero de retweets que tiene el Tweet
     * @param like Numero de likes que tiene el Tweet
     * @param views Numero de views que tiene el Tweet
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
     * Retorna los likes.
     *
     * @return devuelve el numero de likes
     */
    public int getLike() {
        return like;
    }

    /**
     * Nuevo valor de likes
     *
     * @param like nuevo valor de like
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * Retorna el nombre de usuario.
     *
     * @return devuelve el nombre del usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Retorna la fecha del tweet
     *
     * @return fecha del tweet
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Retorna contido del tweet.
     *
     * @return devuelve el contenido del tweet
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Nuevo contenido de un tweet. Nuevo contenido si es menor de 280
     * caracteres sino guarda null.
     *
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
     * Retorna el numero de veces que se compartio.
     *
     * @return devuelve el numero de veces que se compartio el tweet
     */
    public int getRetweets() {
        return retweets;
    }

    /**
     * Nuevo valor para el numero de retweets
     *
     * @param retweets Nuevo valor para la cantidad de retweets que 
     * tiene un tweet.
     */
    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

    /**
     * Retorna el numero de veces que se visualizo
     *
     * @return devuelve el numero de veces que se visualizo
     */
    public int getViews() {
        return views;
    }

    /**
     * Nuevo valor para el numero de veces que se visualizo
     *
     * @param views
     */
    public void setViews(int views) {
        this.views = views;
    }

    /**
     * Metodo que suma numero de visualizaciones
     *
     * @param views que se suman a los que ya teniamos
     */
    public void addViews(int views) {
        this.views += views;
    }

    /**
     * Metodo que suma likes
     *
     * @param like que se suman a los que teniamos
     */
    public void addLikes(int like) {
        this.like += like;
    }

    /**
     * Metodo que suma retweets
     *
     * @param retweets que se suman a los que teniamos
     */
    public void addRetweets(int retweets) {
        this.retweets += retweets;
    }

    /**
     * Retorna el numero de caracteres de el contenido.
     *
     * @return devuelve la longitud de el contenido del tweet
     */
    public int tamanho() {

        return this.contenido.length();
    }

    /**
     * Retorna todas las variables del objeto en un string
     *
     * @return todo lo que contiene el objeto concantenando sus variables en un
     * String.
     */

    public String toString() {
        return usuario + "\n" + fecha + "\n" + contenido + "\n" + "like " + like
                + "  Ret " + retweets + "    Vistos por " + views + " usuarios";
    }

}
