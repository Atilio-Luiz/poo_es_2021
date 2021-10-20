/**
 * A classe RegistroAcademico contém atributos para
 * representar dados simples sobre um registro acadêmico
 */
class RegistroAcademico {
    /**
    * Declaração dos campos da classe
    */
    private String nomeDoAluno;
    private int numeroDeMatricula;
    private byte codigoDoCurso;
    private double percentualDeCobranca;
    
    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public byte getCodigoDoCurso() {
        return codigoDoCurso;
    }

    /**
     * O método inicializaRegistro recebe argumentos para inicializar
     * os atributos da classe RegistroAcademico
     * @param n o nome do aluno
     * @param m o número de matrícula
     * @param c o código do curso
     * @param p o percentual de bolsa
     */
    public void inicializaRegistro(String n, int m, byte c, double p) {
        nomeDoAluno = n;
        numeroDeMatricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }

    public double calculaMensalidade() {
        double mensalidade = 0.0;
        switch(codigoDoCurso) {
            case 1: mensalidade = 450.0; break; // Arquitetura
            case 2: mensalidade = 500.0; break; // Ciência da Computação
            case 3: mensalidade = 550.0; break; // Engenharia de Computação
            case 4: mensalidade = 380.0; break; // Zootecnia
        }
        // Agora, calcula o desconto com o percentual de cobrança
        if(percentualDeCobranca == 0) {
            mensalidade = 0.0;
        } 
        else { 
            mensalidade = mensalidade * 100.0 / percentualDeCobranca;
            System.out.println("mensalidade = " + mensalidade);
        }
        return mensalidade;
    }
} 