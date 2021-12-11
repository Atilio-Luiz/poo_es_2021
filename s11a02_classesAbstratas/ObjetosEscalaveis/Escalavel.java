/**
 * A interface Escalavel define que métodos um objeto que seja escalável
 * (isto é, que pode ter seu tamanho modificado como uma função do tamanho anterior)
 * deve conter. Esta interface não declara nenhum atributo.
 */
public interface Escalavel {
    /**
     * O método amplia modifica os campos do objeto para alterar o seu tamanho.
     * @param escala a escala para modificação do objeto
     */
    public void amplia(double escala);

    /**
     * O método espelha modifica os campos do objeto para alterar a sua posição
     * (fazendo com que o objeto fique refletido nas suas coordenadas horizontais)
     */
    public void espelha();
}
